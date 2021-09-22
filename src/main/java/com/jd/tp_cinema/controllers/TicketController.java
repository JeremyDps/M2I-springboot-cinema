package com.jd.tp_cinema.controllers;

import com.jd.tp_cinema.interfaces.SeanceService;
import com.jd.tp_cinema.models.Seance;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
@RequestMapping("ticket/myticket")
public class TicketController {

    private SeanceService seanceService;

    public TicketController(SeanceService seanceService) {this.seanceService = seanceService;}


    @GetMapping("{id}")
    public HashMap getTicket(@PathVariable String id) {
        return seanceService.getTicket(id);
    }

}
