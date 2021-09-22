package com.jd.tp_cinema.controllers;

import com.jd.tp_cinema.interfaces.SalleService;
import com.jd.tp_cinema.models.Salle;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("cinema/salle")
public class SalleController {

    private SalleService salleService;

    public SalleController(SalleService salleService) {
        this.salleService = salleService;
    }

    @GetMapping
    public List<Salle> findAll() {
        return this.salleService.findAll();
    }

    @PostMapping
    public Salle create(@RequestBody Salle salle) {
        this.salleService.create(salle);
        return salle;
    }

    @PutMapping
    public Salle put(@RequestBody Salle salle) {
        this.salleService.put(salle);
        return salle;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.salleService.delete(id);
    }

    @GetMapping("{id}")
    public Optional<Salle> findOne(@PathVariable String id) {
        return this.salleService.findById(id);
    }
}
