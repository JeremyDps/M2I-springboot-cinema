package com.jd.tp_cinema.services;

import com.jd.tp_cinema.interfaces.CinemaService;
import com.jd.tp_cinema.models.Cinema;
import com.jd.tp_cinema.repositories.CinemaRepository;

public class CinemaServiceImpl implements CinemaService {

    private CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @Override
    public Cinema create(Cinema cinema) {
        this.cinemaRepository.save(cinema);
        return cinema;
    }
}
