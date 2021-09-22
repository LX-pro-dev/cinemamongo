package com.example.cinemamongo.services;

import com.example.cinemamongo.models.Salle;

import java.util.List;

public interface SalleService {
    public Salle create(Salle salle);

    public List<Salle> findAll();

    public Salle findById(String id);

    public void delete(String id);

    public Salle putSalle(Salle salle);

    public Salle patchNumero(String id, String numeroDeSalle);

    public Salle patchNombreDePlaces(String id, Integer nombreDePlaces);
}
