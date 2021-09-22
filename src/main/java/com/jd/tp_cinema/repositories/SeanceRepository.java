package com.jd.tp_cinema.repositories;

import com.jd.tp_cinema.models.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeanceRepository extends MongoRepository<Seance, String> {
}
