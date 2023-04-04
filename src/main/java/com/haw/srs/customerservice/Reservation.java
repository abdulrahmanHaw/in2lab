package com.haw.srs.customerservice;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int saalNummer;
    private int platz;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    public Reservation(Movie movie) {
        this.movie = movie;
    }

    public Reservation() {

    }
}
