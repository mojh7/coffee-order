package com.mojh.coffeeorder.favorite.service;

import com.mojh.coffeeorder.favorite.repository.FavoriteRepository;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {
    private final FavoriteRepository favoriteRepository;

    public FavoriteService(final FavoriteRepository favoriteRepository) {
        this.favoriteRepository = favoriteRepository;
    }
}
