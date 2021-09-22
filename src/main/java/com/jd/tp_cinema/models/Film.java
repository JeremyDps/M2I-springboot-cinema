package com.jd.tp_cinema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {

    @Id
    private String id;
    private String nom;
    private Integer duree;

    @DBRef
    @Field("cinema")
    private Cinema cinema;
}
