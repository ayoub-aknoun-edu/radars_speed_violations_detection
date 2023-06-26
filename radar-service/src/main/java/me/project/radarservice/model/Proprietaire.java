package me.project.radarservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Proprietaire {
    private Long id;
    private String name;
    private Date dateNaissance;
    private String email;
}
