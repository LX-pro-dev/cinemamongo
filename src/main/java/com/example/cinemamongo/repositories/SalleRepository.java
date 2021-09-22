package com.example.cinemamongo.repositories;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface SalleRepository extends MongoRepository<Salle, String> {
    public Salle findSalleById(String id);

    public List<Seance> findSeancesBySalleId(String id);

    public Cinema findCinemaBySalleId(String id);
}
