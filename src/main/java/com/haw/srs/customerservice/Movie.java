package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private int duration;

    @OneToMany(mappedBy = "movie")
    private List<Reservation> reservations = new ArrayList<>();

    public Movie(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public Movie() {

    }
}

