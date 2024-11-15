package com.mojh.coffeeorder.favorite.controller;

import com.mojh.coffeeorder.favorite.service.FavoriteService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FavoriteController {
    private final FavoriteService favoriteService;

    public FavoriteController(final FavoriteService favoriteService) {
        this.favoriteService = favoriteService;
    }

}
