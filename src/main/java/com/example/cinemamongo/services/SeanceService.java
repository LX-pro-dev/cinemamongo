package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Seance;

import java.util.List;

public interface SeanceService {
    public List<Seance> findAll();

    public Seance create(Seance seance);

    public void delete(String id);

    public Seance update(Seance seance);

    public Film findFilmBySeanceId(String id);
}
