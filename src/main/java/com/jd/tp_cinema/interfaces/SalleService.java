package com.jd.tp_cinema.interfaces;

import com.jd.tp_cinema.models.Film;
import com.jd.tp_cinema.models.Salle;

import java.util.List;
import java.util.Optional;

public interface SalleService {

    public List<Salle> findAll();

    public Salle create(Salle salle);

    public Optional<Salle> findById(String id);

    public Salle put(Salle salle);

    public void delete(String id);
}
