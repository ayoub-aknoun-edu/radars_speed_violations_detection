package me.project.radarservice.clients;

import me.project.radarservice.model.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "INFRACTION-SERVICE")
public interface InfractionServiceFeignClient {
    @PostMapping("/infractions")
    Infraction createInfraction(@RequestBody Infraction infraction);
}