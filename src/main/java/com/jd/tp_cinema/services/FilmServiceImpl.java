package com.jd.tp_cinema.services;

import com.jd.tp_cinema.interfaces.FilmService;
import com.jd.tp_cinema.models.Film;
import com.jd.tp_cinema.repositories.CinemaRepository;
import com.jd.tp_cinema.repositories.FilmRepository;

import java.util.List;
import java.util.Optional;

public class FilmServiceImpl implements FilmService {

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> findAll() {
        return this.filmRepository.findAll();
    }

    @Override
    public Film create(Film film) {
        this.filmRepository.save(film);
        return film;
    }

    @Override
    public Optional<Film> findById(String id) {
        return this.filmRepository.findById(id);
    }

    @Override
    public Film put(Film film) {
        this.filmRepository.save(film);
        return film;
    }

    @Override
    public void delete(String id) {
        this.filmRepository.deleteById(id);
    }
}
