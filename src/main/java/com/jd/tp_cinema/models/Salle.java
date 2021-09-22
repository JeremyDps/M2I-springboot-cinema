package com.jd.tp_cinema.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {

    @Id
    private String id;
    private Integer numero;
    private Integer nbPlaces;

}
