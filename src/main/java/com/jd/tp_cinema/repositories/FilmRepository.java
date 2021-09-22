package com.jd.tp_cinema.repositories;

import com.jd.tp_cinema.models.Film;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilmRepository extends MongoRepository<Film, String> {
}
