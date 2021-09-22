package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Seance;
import com.example.cinemamongo.repositories.FilmRepository;

import java.util.List;

public class FilmServiceImpl implements FilmService{
    private FilmRepository filmRepository;


    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Film create(Film film) {
        return this.filmRepository.save(film);
    }

    @Override
    public Film findFilmById(String id) {
        return this.filmRepository.findFilmById(id);
    }

    @Override
    public void delete(String id) {
        this.filmRepository.deleteById(id);
    }

    @Override
    public Film update(Film film) { return this.filmRepository.save(film);  }

    @Override
    public List<Seance> findSeancesByFilmId(String id) { return this.filmRepository.findSeancesByFilmId(id); }
}
