package com.example.cinemamongo.controllers;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.models.Seance;
import com.example.cinemamongo.repositories.SalleRepository;
import com.example.cinemamongo.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("salle")
public class SalleController {
    private SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> findAll() {
        return this.salleService.findAll();
    }
    @PostMapping
    public Salle create(@RequestBody Salle salle) {
        return this.salleService.create(salle);
    }

    @GetMapping("{id}")
    public Salle findById(@PathVariable String id) {
        return this.salleService.findById(id);
    }

    @PutMapping
    public Salle putSalle(@RequestBody Salle salle) {
        return this.salleService.putSalle(salle);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.salleService.delete(id);
    }


    @PatchMapping("{id}numeroDeSalle")
    public Salle patchNumero(@PathVariable String id, @RequestBody(required = false) String numeroDeSalle) {

        return this.salleService.patchNumero(id, numeroDeSalle);
    }

    @PatchMapping("{id}nombreDePlaces")
    public Salle patchNombreDePlaces(@PathVariable String id, @RequestBody(required = false) Integer nombreDePlaces ) {
        return this.salleService.patchNombreDePlaces(id, nombreDePlaces);
    }

    @GetMapping("{id}/seance")
    public List<Seance> findSeancesBySalleId(@PathVariable String id) {
        return this.salleService.findSeancesBySalleId(id);
    }

    @GetMapping("{id}/cinema")
    public Cinema findCinemaBySalleId(String id) {
        return this.salleService.findCinemaBySalleId(id);
    }

    @GetMapping("{id}/film")
    public List<Film> findfilmsBySalleId(@PathVariable String id) {
        return this.salleService.findFilmsBySalleId(id);
    }
}
