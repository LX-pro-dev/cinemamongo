package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Salle;
import com.example.cinemamongo.repositories.SalleRepository;

import java.util.List;

public class SalleServiceImpl implements SalleService{

    private SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public Salle create(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Salle findById(String id) {
        return this.salleRepository.findSalleById(id);
    }

    @Override
    public void delete(String id) {
        this.salleRepository.deleteById(id);
    }

    @Override
    public Salle putSalle(Salle salle) {
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle patchNumero(String id, String numeroDeSalle) {
        Salle salle = findById(id);
        salle.setNumeroDeSalle(numeroDeSalle);
        return this.salleRepository.save(salle);
    }

    @Override
    public Salle patchNombreDePlaces(String id, Integer nombreDePlaces) {
        Salle salle = findById(id);
        salle.setNombreDePlaces(nombreDePlaces);
        return this.salleRepository.save(salle);
    }
}
