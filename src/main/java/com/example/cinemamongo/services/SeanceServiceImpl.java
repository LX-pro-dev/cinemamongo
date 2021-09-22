package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Film;
import com.example.cinemamongo.models.Seance;
import com.example.cinemamongo.repositories.SeanceRepository;

import java.util.List;

public class SeanceServiceImpl implements SeanceService{

    SeanceRepository seanceRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }


    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Seance create(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public void delete(String id) { this.seanceRepository.deleteById(id); }

    @Override
    public Seance update(Seance seance) {
        return this.seanceRepository.save(seance);
    }

    @Override
    public Film findFilmBySeanceId(String id) {
        return this.seanceRepository.findFilmBySeanceId(id);
    }


}
