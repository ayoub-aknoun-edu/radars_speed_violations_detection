package me.project.infractionservice;

import me.project.infractionservice.entities.Infraction;
import me.project.infractionservice.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@SpringBootApplication
@CrossOrigin("*")
public class InfractionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfractionServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(InfractionRepository infractionRepo){
        return args -> {
        infractionRepo.save(new Infraction(null, new Date(),1L,"AA-123-BB", 120.0, 100.0, 1000.0));

        };
    }

}
