package me.project.immatriculationservice;


import me.project.immatriculationservice.entities.Proprietaire;
import me.project.immatriculationservice.entities.Vehicule;
import me.project.immatriculationservice.repositories.ProprietaireRepository;
import me.project.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@SpringBootApplication
@CrossOrigin("*")
public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProprietaireRepository proprietaireRepo, VehiculeRepository vehiculeRepo) {
        return args -> {
            Proprietaire p1 = proprietaireRepo.save(new Proprietaire(null, "Hassan", new Date(), "has@email.fr"));
            Proprietaire p2 = proprietaireRepo.save(new Proprietaire(null, "hmad", new Date(), "hhamada@email.fr"));
            Proprietaire p3 = proprietaireRepo.save(new Proprietaire(null, "yassine", new Date(), "xxyassienx@gmail.com"));
            Proprietaire p4 = proprietaireRepo.save(new Proprietaire(null, "rajae", new Date(), "perajaes@gmail.com"));
            Proprietaire p5 = proprietaireRepo.save(new Proprietaire(null, "stiller", new Date(), "abir@email.com"));
            vehiculeRepo.save(new Vehicule(null, "AA-123-BB", "Renault", 5, "Clio", p1.getId(), p1));
            vehiculeRepo.save(new Vehicule(null, "AA-123-CC", "Peugeot", 5, "308",p2.getId(), p2));
            vehiculeRepo.save(new Vehicule(null, "AA-123-DD", "Citroen", 5, "C4", p3.getId(),p3));
            vehiculeRepo.save(new Vehicule(null, "AA-123-EE", "Mercedes", 5, "Class A", p4.getId(),p4));
            vehiculeRepo.save(new Vehicule(null, "AA-123-FF", "BMW", 5, "Serie 1", p5.getId(),p5));
            vehiculeRepo.save(new Vehicule(null, "AA-123-GG", "Audi", 5, "A3", p1.getId(),p1));
            vehiculeRepo.findAll().forEach(System.out::println);


        };
    }
}
