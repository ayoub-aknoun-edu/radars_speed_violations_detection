package me.project.immatriculationservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ProprietaireDto{
        String name;
        String email;
        Date dateNaissance;
}