package me.project.radarservice.clients;

import me.project.radarservice.model.Proprietaire;
import me.project.radarservice.model.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "IMMATRICULATION-SERVICE")
public interface ImmatriculationServiceFeignClient {
    @GetMapping("/proprietaires/{id}")
    Proprietaire getProprietaire(@PathVariable Long id);

    @GetMapping("/vehicules/{matricule}")
    Vehicule getVehiculeByMatricule(@PathVariable String matricule);

}
