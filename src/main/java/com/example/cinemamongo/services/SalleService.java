package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.models.Seance;

import java.util.List;

public interface SalleService {
    public Salle create(Salle salle);

    public List<Salle> findAll();

    public Salle findById(String id);

    public void delete(String id);

    public Salle putSalle(Salle salle);

    public Salle patchNumero(String id, String numeroDeSalle);

    public Salle patchNombreDePlaces(String id, Integer nombreDePlaces);

    public List<Seance> findSeancesBySalleId(String id);

    public Cinema findCinemaBySalleId(String id);

    List<Film> findFilmsBySalleId(String id);
}
