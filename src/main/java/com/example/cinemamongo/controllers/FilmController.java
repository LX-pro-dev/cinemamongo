package com.example.cinemamongo.controllers;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Seance;
import com.example.cinemamongo.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("film")
public class FilmController {
    private FilmService filmService;


    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll() {
        return this.filmService.findAll();
    }

    @PostMapping
    public Film create(@RequestBody Film film) {
        return this.filmService.create(film);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.filmService.findFilmById(id);
    }

    @PutMapping
    public Film update(@RequestBody Film film) {
        return this.filmService.update(film);
    }

    @GetMapping("{id}/seance")
    public List<Seance> findSeancesByFilmId(String id) { return this.filmService.findSeancesByFilmId(id); }
}
