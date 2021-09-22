package com.example.cinemamongo.controllers;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.services.CinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("cinema")
public class CinemaController {
    CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping
    public List<Cinema> findAll() {
        return this.cinemaService.findAll();
    }

    @PostMapping
    public Cinema create(@RequestBody Cinema cinema) {
        return this.cinemaService.create(cinema);
    }

    @GetMapping("{id}")
    public Cinema findCinemaById(@PathVariable String id) {
        return this.cinemaService.findCinemaById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.cinemaService.delete(id);
    }

    @PutMapping
    public Cinema update(@RequestBody Cinema cinema) {
        return this.cinemaService.update(cinema);
    }

    @GetMapping("{id}/salle")
    public List<Salle> findSallesByCinemaId(@PathVariable String id) {
        return this.cinemaService.findSallesByCinemaId(id);
    }

}
