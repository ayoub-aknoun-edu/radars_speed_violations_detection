package me.project.immatriculationservice.repositories;

import me.project.immatriculationservice.entities.Proprietaire;
import me.project.immatriculationservice.entities.Vehicule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;




public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    Vehicule findByMatricule(String matricule);
    List<Vehicule> findByProprietaire(Proprietaire proprietaire);

    Page<Vehicule> findByMatriculeContaining(String keyword, Pageable pageable);
}
