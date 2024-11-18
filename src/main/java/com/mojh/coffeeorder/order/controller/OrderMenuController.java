package com.mojh.coffeeorder.order.controller;

import com.mojh.coffeeorder.order.service.OrderMenuService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderMenuController {

    private final OrderMenuService orderMenuService;

    public OrderMenuController(final OrderMenuService orderMenuService) {
        this.orderMenuService = orderMenuService;
    }

}
