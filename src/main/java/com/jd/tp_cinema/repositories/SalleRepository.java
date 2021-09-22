package com.jd.tp_cinema.repositories;

import com.jd.tp_cinema.models.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalleRepository extends MongoRepository<Salle, String> {
}
