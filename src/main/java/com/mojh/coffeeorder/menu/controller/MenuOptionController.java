package com.mojh.coffeeorder.menu.controller;

import com.mojh.coffeeorder.menu.service.MenuOptionService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuOptionController {

    private final MenuOptionService menuOptionService;

    public MenuOptionController(final MenuOptionService menuOptionService) {
        this.menuOptionService = menuOptionService;
    }

}
