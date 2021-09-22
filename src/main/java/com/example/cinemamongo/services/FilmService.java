package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Film;

import java.util.List;

public interface FilmService {
    public List<Film> findAll();

    public Film create(Film film);

    public Film findFilById(String id);

    public void delete(String id);

    public void update(Film film);
}
