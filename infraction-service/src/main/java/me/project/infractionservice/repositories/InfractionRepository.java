package me.project.infractionservice.repositories;


import me.project.infractionservice.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;



public interface InfractionRepository extends JpaRepository<Infraction, Long> {
    List<Infraction> getInfractionsByMatriculeVehicule(String matricule);
}