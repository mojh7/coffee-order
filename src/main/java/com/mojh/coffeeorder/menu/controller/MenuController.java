package com.mojh.coffeeorder.menu.controller;

import com.mojh.coffeeorder.menu.service.MenuService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuController {

    private final MenuService menuService;

    public MenuController(final MenuService menuService) {
        this.menuService = menuService;
    }

}