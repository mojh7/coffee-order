package com.mojh.coffeeorder.order.controller;

import com.mojh.coffeeorder.order.service.OrderMenuDetailService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderMenuDetailController {

    private final OrderMenuDetailService orderMenuDetailService;

    public OrderMenuDetailController(final OrderMenuDetailService orderMenuDetailService) {
        this.orderMenuDetailService = orderMenuDetailService;
    }

}
