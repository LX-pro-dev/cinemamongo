package com.example.cinemamongo.repositories;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FilmRepository extends MongoRepository<Film, String> {
    public Film findFilmById(String id);

    List<Seance> findSeancesByFilmId(String id);
}
