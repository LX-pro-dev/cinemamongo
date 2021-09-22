package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Seance;

import java.util.List;

public interface FilmService {
    public List<Film> findAll();

    public Film create(Film film);

    public Film findFilmById(String id);

    public void delete(String id);

    public Film update(Film film);

    public List<Seance> findSeancesByFilmId(String id);
}
