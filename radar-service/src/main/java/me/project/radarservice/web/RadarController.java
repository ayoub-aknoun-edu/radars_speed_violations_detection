package me.project.radarservice.web;

import lombok.AllArgsConstructor;
import me.project.radarservice.clients.ImmatriculationServiceFeignClient;
import me.project.radarservice.clients.InfractionServiceFeignClient;
import me.project.radarservice.dtos.DeppassementVitasseRequest;
import me.project.radarservice.entities.Radar;
import me.project.radarservice.model.Infraction;
import me.project.radarservice.model.Proprietaire;
import me.project.radarservice.model.Vehicule;
import me.project.radarservice.repositories.RadarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@AllArgsConstructor
public class RadarController {

    private RadarRepository radarRepository;
    private ImmatriculationServiceFeignClient immatriculationServiceFeignClient;
    private InfractionServiceFeignClient infractionServiceFeignClient;




    @PostMapping("/radars/depassements")
    public Infraction handleDepassementVitesse(DeppassementVitasseRequest request) {
        Radar radar = radarRepository.findById(request.getNumeroRadar()).get();
        Vehicule vehicule = immatriculationServiceFeignClient.getVehiculeByMatricule(request.getVehiculeMatricule());
        Proprietaire proprietaire = vehicule.getProprietaire();

        Infraction infraction = new Infraction();
        infraction.setDate(new Date());
        infraction.setNumeroRadar(request.getNumeroRadar());
        infraction.setMatriculeVehicule(request.getVehiculeMatricule());
        infraction.setVitesseVehicule(request.getVitesseVehicule());
        infraction.setVitesseMaximaleRadar(radar.getVitesseMaximale());
        infraction.setMontantInfraction(300.0);
        return infractionServiceFeignClient.createInfraction(infraction);
    }

    @GetMapping("/radars/{id}")
    public Radar getRadarById(@PathVariable(value = "id") Long id) {
        return radarRepository.findById(id).get();
    }

    @GetMapping("/radars")
    public Iterable<Radar> getRadars() {
        return radarRepository.findAll();
    }

    @PostMapping("/radars")
    public Radar createRadar(@RequestBody Radar radar) {
        return radarRepository.save(radar);
    }

    @PutMapping("/radars/{id}")
    public Radar updateRadar(@PathVariable(value = "id") Long id, @RequestBody Radar radar) {
        radar.setNumeroRadar(id);
        return radarRepository.save(radar);
    }


    @GetMapping("/radars/pageRadar")
    public Page<Radar> getPageRadar(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return radarRepository.findAll(pageable);
    }



    @GetMapping("/radars/count")
    public Long getRadarsCount() {
        return radarRepository.count();
    }

}

