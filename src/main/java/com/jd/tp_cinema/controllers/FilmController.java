package com.jd.tp_cinema.controllers;

import com.jd.tp_cinema.interfaces.FilmService;
import com.jd.tp_cinema.models.Film;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("cinema/film")
public class FilmController {

    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Film> findAll() {
        System.out.println(new Date());
        return this.filmService.findAll();
    }

    @PostMapping
    public Film create(@RequestBody Film film) {
        this.filmService.create(film);
        return film;
    }

    @PutMapping
    public Film put(@RequestBody Film film) {
        this.filmService.put(film);
        return film;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.filmService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Film> findOne(@PathVariable String id) {
        return this.filmService.findById(id);
    }
}
