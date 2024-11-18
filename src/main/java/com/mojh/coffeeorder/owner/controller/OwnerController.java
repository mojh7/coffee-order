package com.mojh.coffeeorder.owner.controller;

import com.mojh.coffeeorder.owner.service.OwnerService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(final OwnerService ownerService) {
        this.ownerService = ownerService;
    }
}