package org.cinema.service;

import org.cinema.repository.CinemaRepository;

public class CinemaService {
    private CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }
}
