package me.project.immatriculationservice.web.rest;

import me.project.immatriculationservice.entities.Proprietaire;
import me.project.immatriculationservice.entities.Vehicule;
import me.project.immatriculationservice.repositories.ProprietaireRepository;
import me.project.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImatRestController {
    ProprietaireRepository proprietaireRepository;
    VehiculeRepository vehiculeRepository;

    public ImatRestController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }


    @GetMapping(path = "/proprietaires")
    List<Proprietaire> getProprietaires() {
        return proprietaireRepository.findAll();
    }

    @GetMapping(path ="/vehicules")
    List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

    @GetMapping(path ="/proprietaires/vehicules/{id}")
    List<Vehicule> getVehiculesByProprietaire(@PathVariable(value = "id") Long id) {
       Proprietaire p = proprietaireRepository.findById(id).get();
       List<Vehicule> vehicules = vehiculeRepository.findByProprietaire(p);
         return vehicules;
    }

    @GetMapping(path ="/vehicules/{matricule}")
    Vehicule getVehiculeByMatricule(@PathVariable(value = "matricule") String matricule) {
        return vehiculeRepository.findByMatricule(matricule);
    }

    @GetMapping(path ="/proprietaires/{id}")
    Proprietaire getProprietaireById(@PathVariable(value = "id") Long id) {
        return proprietaireRepository.findById(id).get();
    }
    @PostMapping(path ="/proprietaires")
    Proprietaire addProprietaire(@RequestBody Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }
    @PostMapping(path ="/vehicules")
    Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        Proprietaire p =proprietaireRepository.findById(vehicule.getProprietaireID()).orElse(null);
        vehicule.setProprietaire(p);
        return vehiculeRepository.save(vehicule);
    }

    @PutMapping(path ="/proprietaires/{id}")
    Proprietaire updateProprietaire(@PathVariable(value = "id") Long id,@RequestBody Proprietaire proprietaire) {
        Proprietaire p = proprietaireRepository.findById(id).get();
        p.setName(proprietaire.getName());
        p.setDateNaissance(proprietaire.getDateNaissance());
        p.setEmail(proprietaire.getEmail());
        return proprietaireRepository.save(p);
    }
    @PutMapping("path =/vehicules/{matricule}")
    Vehicule updateVehicule(@PathVariable(value = "matricule") String matricule,@RequestBody Vehicule vehicule) {
        Vehicule v = vehiculeRepository.findByMatricule(matricule);
        v.setMarque(vehicule.getMarque());
        v.setModele(vehicule.getModele());
        v.setPuissanceFiscale(vehicule.getPuissanceFiscale());
        v.setProprietaireID(vehicule.getProprietaireID());
        Proprietaire p =proprietaireRepository.findById(vehicule.getProprietaireID()).orElse(null);
        v.setProprietaire(p);
        return vehiculeRepository.save(v);
    }

    // Get all vehicle pages
    @GetMapping("/vehicules/pageVehicle")
    public Page<Vehicule> getPageVehicle(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return vehiculeRepository.findAll(pageable);
    }

    // Search vehicles pages by regestration number containing
    @GetMapping("/vehicules/pageVehicleName/{keyword}")
    public Page<Vehicule> getVehiclesByName(@PathVariable String keyword,
                                           @RequestParam(value = "page", defaultValue = "0") int page,
                                           @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);

        if (keyword.equals(null)) return vehiculeRepository.findAll(pageable);
        return vehiculeRepository.findByMatriculeContaining(keyword, pageable);
    }

    // Get number of all vehicles
    @GetMapping("/vehicules/count")
    public Long getVehiclesCount() {
        return vehiculeRepository.count();
    }

    @DeleteMapping(path ="/proprietaires/{id}")
    void deleteProprietaire(@RequestBody Proprietaire proprietaire) {
        proprietaireRepository.delete(proprietaire);
    }
    @DeleteMapping(path ="/vehicules/{matricule}")
    void deleteVehicule(@RequestBody Vehicule vehicule) {
        vehiculeRepository.delete(vehicule);
    }

 }
