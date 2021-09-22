package com.example.cinemamongo.repositories;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {
    Film findFilmBySeanceId(String id);
}
