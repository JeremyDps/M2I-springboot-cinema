package com.jd.tp_cinema;

import com.jd.tp_cinema.interfaces.CinemaService;
import com.jd.tp_cinema.interfaces.FilmService;
import com.jd.tp_cinema.interfaces.SalleService;
import com.jd.tp_cinema.interfaces.SeanceService;
import com.jd.tp_cinema.repositories.CinemaRepository;
import com.jd.tp_cinema.repositories.FilmRepository;
import com.jd.tp_cinema.repositories.SalleRepository;
import com.jd.tp_cinema.repositories.SeanceRepository;
import com.jd.tp_cinema.services.CinemaServiceImpl;
import com.jd.tp_cinema.services.FilmServiceImpl;
import com.jd.tp_cinema.services.SalleServiceImpl;
import com.jd.tp_cinema.services.SeanceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CinemaService cinemaService(CinemaRepository cinemaRepository) {
        return new CinemaServiceImpl(cinemaRepository);
    }

    @Bean
    public FilmService filmService(FilmRepository filmRepository) {
        return new FilmServiceImpl(filmRepository);
    }

    @Bean
    public SeanceService seanceService(SeanceRepository seanceRepository) {
        return new SeanceServiceImpl(seanceRepository);
    }

    @Bean
    public SalleService salleService(SalleRepository salleRepository) {
        return new SalleServiceImpl(salleRepository);
    }
}
