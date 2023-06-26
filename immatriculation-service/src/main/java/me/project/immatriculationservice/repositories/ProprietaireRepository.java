package me.project.immatriculationservice.repositories;

import me.project.immatriculationservice.entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {
}
