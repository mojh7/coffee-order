package com.mojh.coffeeorder.user.controller;

import com.mojh.coffeeorder.user.service.UserService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

}