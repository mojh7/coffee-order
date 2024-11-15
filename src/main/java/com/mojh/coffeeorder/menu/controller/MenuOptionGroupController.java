package com.mojh.coffeeorder.menu.controller;

import com.mojh.coffeeorder.menu.service.MenuOptionGroupService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuOptionGroupController {

    private final MenuOptionGroupService menuOptionGroupService;

    public MenuOptionGroupController(final MenuOptionGroupService menuOptionGroupService) {
        this.menuOptionGroupService = menuOptionGroupService;
    }

}
