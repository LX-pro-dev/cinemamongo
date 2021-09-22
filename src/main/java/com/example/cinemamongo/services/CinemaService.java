package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Salle;

import java.util.List;

public interface CinemaService {
    public List<Cinema> findAll();

    public Cinema create(Cinema cinema);

    public Cinema findCinemaById(String id);

    public void delete(String id);

    public Cinema update(Cinema cinema);

    List<Salle> findSallesByCinemaId(String id);
}
