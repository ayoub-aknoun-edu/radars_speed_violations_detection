package me.project.infractionservice.web;

import lombok.AllArgsConstructor;
import me.project.infractionservice.entities.Infraction;
import me.project.infractionservice.repositories.InfractionRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class InfractionController {
    private InfractionRepository infractionRepository;

    @GetMapping("/infractions")
    public List<Infraction> getInfractions(){
        return infractionRepository.findAll();
    }

    @GetMapping("/infractions/{matricule}")
    public List<Infraction> getInfractionsByMatricule(@PathVariable String matricule){
        return infractionRepository.getInfractionsByMatriculeVehicule(matricule);
    }

    @PostMapping("/infractions")
    public Infraction createInfraction(@RequestBody Infraction infraction){
        return infractionRepository.save(infraction);
    }
    @GetMapping(path = "/infractions/fullInfractionsPages")
    public Page<Infraction> getFullInfractions(
            @RequestParam(value = "page") int page,
            @RequestParam(value = "size") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Infraction> infractionsPage = infractionRepository.findAll(pageable);
        List<Infraction> infractions = infractionsPage.getContent();
        long totalElements = infractionsPage.getTotalElements();
        return new PageImpl<>(infractions, pageable,totalElements);
    }

    @GetMapping(path = "/infractions/PageInfraction")
    public List<Infraction> getFullInPagefractions( @RequestParam(value = "page", defaultValue = "0") int page,
                                                    @RequestParam(value = "size", defaultValue = "5") int size){
        List<Infraction> infractions = infractionRepository.findAll();

        Pageable pageable = PageRequest.of(page, size);
        return infractions;
    }

    @GetMapping("/infractions/count")
    public Long getInfractionsCount() {
        return infractionRepository.count();
    }


}
