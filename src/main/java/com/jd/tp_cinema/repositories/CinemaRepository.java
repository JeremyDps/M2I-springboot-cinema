package com.jd.tp_cinema.repositories;

import com.jd.tp_cinema.models.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CinemaRepository extends MongoRepository<Cinema, String> {
}
