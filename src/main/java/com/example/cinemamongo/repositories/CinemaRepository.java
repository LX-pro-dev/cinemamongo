package com.example.cinemamongo.repositories;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CinemaRepository extends MongoRepository<Cinema, String> {
    public Cinema findCinemaById(String id);

    List<Salle> findSallesByCinemaId(String id);
}
