package me.project.immatriculationservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import me.project.immatriculationservice.entities.Proprietaire;
import me.project.immatriculationservice.entities.Vehicule;
import me.project.immatriculationservice.repositories.ProprietaireRepository;
import me.project.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@WebService(serviceName = "ImatriculationService")
public class ImatSoapController {
    private ProprietaireRepository proprietaireRepository;
    private VehiculeRepository vehiculeRepository;

public ImatSoapController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @WebMethod
    public List<Proprietaire> getProprietaires() {
        List<Proprietaire> proprietaires = proprietaireRepository.findAll();
        return proprietaires;
    }

    @WebMethod
    public Proprietaire getProprietaire(@WebParam(name="id") Long id) {
        Proprietaire proprietaire = proprietaireRepository.findById(id).orElse(null);
        return proprietaire;
    }

    @WebMethod
    public Proprietaire createProprietaire(@WebParam Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }

    @WebMethod
    public Proprietaire updateProprietaire(@WebParam Long id,@WebParam Proprietaire proprietaire) {
    Proprietaire proprietaireToUpdate = proprietaireRepository.findById(id).orElse(null);
        proprietaireToUpdate.setName(proprietaire.getName());
        proprietaireToUpdate.setEmail(proprietaire.getEmail());
        proprietaireToUpdate.setDateNaissance(proprietaire.getDateNaissance());
        return proprietaireRepository.save(proprietaireToUpdate);
    }

    @WebMethod
    public void deleteProprietaire(@WebParam Long id) {
        proprietaireRepository.deleteById(id);
    }

    @WebMethod
    public List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
    }

    @WebMethod
    public Vehicule getVehicule(@WebParam Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }
    @WebMethod
    public Vehicule createVehicule(@WebParam Vehicule vehicule) {
      Proprietaire proprietaire = proprietaireRepository.findById(vehicule.getProprietaireID()).orElse(null);
        vehicule.setProprietaire(proprietaire);
        return vehiculeRepository.save(vehicule);
    }
    @WebMethod
    public Vehicule updateVehicule(@WebParam Long id,@WebParam Vehicule vehicule) {
        Vehicule vehiculeToUpdate = vehiculeRepository.findById(id).orElse(null);
        vehiculeToUpdate.setMarque(vehicule.getMarque());
        vehiculeToUpdate.setModele(vehicule.getModele());
        vehiculeToUpdate.setMatricule(vehicule.getMatricule());
        vehiculeToUpdate.setProprietaireID(vehicule.getProprietaireID());
        vehiculeToUpdate.setProprietaire(proprietaireRepository.findById(vehicule.getProprietaireID()).orElse(null));
        return vehiculeRepository.save(vehiculeToUpdate);
    }
    @WebMethod
    public void deleteVehicule(@WebParam Long id) {
        vehiculeRepository.deleteById(id);
    }




}

