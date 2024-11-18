package com.mojh.coffeeorder.order.controller;

import com.mojh.coffeeorder.order.service.OrderService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

}
