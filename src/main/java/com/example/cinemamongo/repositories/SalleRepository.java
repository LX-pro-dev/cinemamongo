package com.example.cinemamongo.repositories;

import com.example.cinemamongo.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SalleRepository extends MongoRepository<Salle, String> {
    public Salle findSalleById(String id);
}
