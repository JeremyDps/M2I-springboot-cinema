package com.jd.tp_cinema.interfaces;

import com.jd.tp_cinema.models.Film;
import com.jd.tp_cinema.models.Seance;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface SeanceService {

    public List<Seance> findAll();

    public Seance create(Seance seance);

    public Optional<Seance> findById(String id);

    public Seance put(Seance seance);

    public void delete(String id);

    public HashMap getTicket(String id);
}
