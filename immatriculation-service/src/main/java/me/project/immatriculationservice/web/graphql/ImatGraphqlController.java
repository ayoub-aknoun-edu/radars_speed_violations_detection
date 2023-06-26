package me.project.immatriculationservice.web.graphql;

import me.project.immatriculationservice.dtos.ProprietaireDto;
import me.project.immatriculationservice.dtos.VehiculeDto;
import me.project.immatriculationservice.entities.Proprietaire;
import me.project.immatriculationservice.entities.Vehicule;
import me.project.immatriculationservice.repositories.ProprietaireRepository;
import me.project.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class ImatGraphqlController {
private ProprietaireRepository proprietaireRepository;
private VehiculeRepository vehiculeRepository;

public ImatGraphqlController(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        this.proprietaireRepository = proprietaireRepository;
        this.vehiculeRepository = vehiculeRepository;
}

@QueryMapping
public List<Proprietaire> getProprietaires() {
        List<Proprietaire> proprietaires = proprietaireRepository.findAll();
        proprietaires.forEach(System.out::println);
        return proprietaires;
}

@QueryMapping
public Proprietaire getProprietaire(@Argument Long id) {
        return proprietaireRepository.findById(id).get();
}

@QueryMapping
public List<Vehicule> getVehicules() {
        return vehiculeRepository.findAll();
}

@QueryMapping
public Vehicule getVehicule(@Argument Long id) {
        return vehiculeRepository.findById(id).get();
}


@MutationMapping
public Proprietaire createProprietaire(@Argument ProprietaireDto proprietaire) {
        Proprietaire p = new Proprietaire();
        p.setName(proprietaire.getName());
        p.setDateNaissance(proprietaire.getDateNaissance());
        p.setEmail(proprietaire.getEmail());
        return proprietaireRepository.save(p);
}

@MutationMapping
public Proprietaire updateProprietaire(@Argument Long id,@Argument ProprietaireDto proprietaire) {
        Proprietaire p = proprietaireRepository.findById(id).get();
        p.setName(proprietaire.getName());
        p.setDateNaissance(proprietaire.getDateNaissance());
        p.setEmail(proprietaire.getEmail());
        return proprietaireRepository.save(p);
}

@MutationMapping
public Boolean deleteProprietaire(@Argument Long id) {
        proprietaireRepository.deleteById(id);
        return true;
}

@MutationMapping
public Vehicule createVehicule(@Argument VehiculeDto vehicule) {
        Vehicule v = new Vehicule();
        Proprietaire p = proprietaireRepository.findById(vehicule.getProprietaireID()).get();
        v.setMarque(vehicule.getMarque());
        v.setModele(vehicule.getModele());
        v.setMatricule(vehicule.getMatricule());
        v.setProprietaire(p);
        v.setPuissanceFiscale(vehicule.getPuissanceFiscale());
        return vehiculeRepository.save(v);
}

@MutationMapping
public Vehicule updateVehicule(@Argument Long id, @Argument VehiculeDto vehicule) {
        Vehicule v = vehiculeRepository.findById(id).get();
        v.setMarque(vehicule.getMarque());
        v.setModele(vehicule.getModele());
        v.setMatricule(vehicule.getMatricule());
        v.setProprietaire(proprietaireRepository.findById(vehicule.getProprietaireID()).get());
        v.setPuissanceFiscale(vehicule.getPuissanceFiscale());
        return vehiculeRepository.save(v);
}

@MutationMapping
public Boolean deleteVehicule(@Argument Long id) {
        vehiculeRepository.deleteById(id);
        return true;
}

}





