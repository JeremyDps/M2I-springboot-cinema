package com.jd.tp_cinema.services;

import com.jd.tp_cinema.models.Seance;
import com.jd.tp_cinema.interfaces.SeanceService;
import com.jd.tp_cinema.repositories.SeanceRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class SeanceServiceImpl implements SeanceService {

    private SeanceRepository seanceRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    @Override
    public List<Seance> findAll() {
        return this.seanceRepository.findAll();
    }

    @Override
    public Seance create(Seance seance) {
        this.seanceRepository.save(seance);
        return seance;
    }

    @Override
    public Optional<Seance> findById(String id) {
        return this.seanceRepository.findById(id);
    }

    @Override
    public Seance put(Seance seance) {
        this.seanceRepository.save(seance);
        return seance;
    }

    @Override
    public void delete(String id) {
        this.seanceRepository.deleteById(id);
    }

    @Override
    public HashMap getTicket(String id) {
        HashMap res = new HashMap<>();

        Optional<Seance> seance = this.seanceRepository.findById(id);

        res.put("Commande", seance.get().getId());
        res.put("Cinéma", seance.get().getSalle().getCinema().getNom());
        res.put("Film", seance.get().getFilm().getNom());
        res.put("Date de début", seance.get().getDate());
        res.put("Salle", seance.get().getSalle().getNumero());

        return res;
    }
}
