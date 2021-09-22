package com.jd.tp_cinema.interfaces;

import com.jd.tp_cinema.models.Film;

import java.util.List;
import java.util.Optional;

public interface FilmService {

    public List<Film> findAll();

    public Film create(Film film);

    public Optional<Film> findById(String id);

    public Film put(Film film);

    public void delete(String id);
}
