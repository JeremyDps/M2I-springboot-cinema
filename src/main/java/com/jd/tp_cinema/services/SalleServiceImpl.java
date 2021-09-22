package com.jd.tp_cinema.services;

import com.jd.tp_cinema.interfaces.SalleService;
import com.jd.tp_cinema.models.Salle;
import com.jd.tp_cinema.repositories.SalleRepository;

import java.util.List;
import java.util.Optional;

public class SalleServiceImpl implements SalleService {

    private SalleRepository salleRepository;

    public SalleServiceImpl(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    @Override
    public List<Salle> findAll() {
        return this.salleRepository.findAll();
    }

    @Override
    public Salle create(Salle salle) {
        this.salleRepository.save(salle);
        return salle;
    }

    @Override
    public Optional<Salle> findById(String id) {
        return this.salleRepository.findById(id);
    }

    @Override
    public Salle put(Salle salle) {
        this.salleRepository.save(salle);
        return salle;
    }

    @Override
    public void delete(String id) {
        this.salleRepository.deleteById(id);
    }
}
