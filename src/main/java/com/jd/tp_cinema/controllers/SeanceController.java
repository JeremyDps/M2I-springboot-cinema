package com.jd.tp_cinema.controllers;

import com.jd.tp_cinema.interfaces.SeanceService;
import com.jd.tp_cinema.models.Seance;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("cinema/seance")
public class SeanceController {

    private SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {this.seanceService = seanceService;}

    @GetMapping
    public List<Seance> findAll() {
        return this.seanceService.findAll();
    }

    @PostMapping
    public Seance create(@RequestBody Seance seance) {
        // convertir une LocalDateTime en yyyy/MM/dd HH:mm:ss
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(LocalDateTime.now());
        System.out.println("yyyy/MM/dd HH:mm:ss-> "+dtf.format(seance.getDate()));

        this.seanceService.create(seance);
        return seance;
    }

    @PutMapping
    public Seance put(@RequestBody Seance seance) {
        this.seanceService.put(seance);
        return seance;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.seanceService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Seance> findOne(@PathVariable String id) {
        return this.seanceService.findById(id);
    }


}
