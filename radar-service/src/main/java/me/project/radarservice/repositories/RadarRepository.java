package me.project.radarservice.repositories;

import me.project.radarservice.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RadarRepository extends JpaRepository<Radar,Long> {

}
