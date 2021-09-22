package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Cinema;
import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.repositories.CinemaRepository;

import java.util.List;

public class CinemaServiceImpl implements CinemaService{

    CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }
    @Override
    public List<Cinema> findAll() {
        return this.cinemaRepository.findAll();
    }

    @Override
    public Cinema create(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    @Override
    public Cinema findCinemaById(String id) {
        return this.cinemaRepository.findCinemaById(id);
    }

    @Override
    public void delete(String id) {
        this.cinemaRepository.deleteById(id);

    }

    @Override
    public Cinema update(Cinema cinema) {
        return this.cinemaRepository.save(cinema);
    }

    public List<Salle> findSallesByCinemaId(String id) {
        return this.cinemaRepository.findSallesByCinemaId(id);
    }
}
