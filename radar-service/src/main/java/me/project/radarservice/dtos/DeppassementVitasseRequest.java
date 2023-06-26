package me.project.radarservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class DeppassementVitasseRequest {
    private String VehiculeMatricule;
    private Long numeroRadar;
    private Double vitesseVehicule;
}
