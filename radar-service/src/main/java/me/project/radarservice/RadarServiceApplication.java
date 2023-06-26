package me.project.radarservice;

import me.project.radarservice.entities.Radar;
import me.project.radarservice.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableFeignClients
@CrossOrigin("*")
public class RadarServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RadarRepository radarRepo){

        return args -> {
        radarRepo.save(new Radar(null, 120.0, 100.0, 1000.0));
        radarRepo.save(new Radar(null, 80.0, 700.0, 3000.0));
        radarRepo.findAll().forEach(System.out::println);
        };
    }
}
