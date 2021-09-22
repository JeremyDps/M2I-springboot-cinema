package com.jd.tp_cinema.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {

    @Id
    private String id;
    private LocalDateTime date;

    @DBRef
    @Field("film")
    private Film film;

    @DBRef
    @Field("salle")
    private Salle salle;
}
