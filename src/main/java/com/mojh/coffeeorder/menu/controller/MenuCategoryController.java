package com.mojh.coffeeorder.menu.controller;

import com.mojh.coffeeorder.menu.service.MenuCategoryService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuCategoryController {

    private final MenuCategoryService menuCategoryService;

    public MenuCategoryController(final MenuCategoryService menuCategoryService) {
        this.menuCategoryService = menuCategoryService;
    }

}
