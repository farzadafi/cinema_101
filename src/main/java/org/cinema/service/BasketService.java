package org.cinema.service;

import org.cinema.repository.BasketRepository;

public class BasketService {
    private BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }
}
