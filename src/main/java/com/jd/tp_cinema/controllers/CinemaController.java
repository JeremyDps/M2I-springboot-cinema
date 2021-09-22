package com.jd.tp_cinema.controllers;

import com.jd.tp_cinema.interfaces.CinemaService;
import com.jd.tp_cinema.models.Cinema;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("cinema/cinema")
public class CinemaController {

    private CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @PostMapping
    public Cinema create(@RequestBody Cinema cinema) {
        this.cinemaService.create(cinema);
        return cinema;
    }

}
