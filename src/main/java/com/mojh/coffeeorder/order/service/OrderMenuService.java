package com.mojh.coffeeorder.order.service;

import com.mojh.coffeeorder.order.repository.OrderMenuRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderMenuService {

    private final OrderMenuRepository orderMenuRepository;

    public OrderMenuService(final OrderMenuRepository orderMenuRepository) {
        this.orderMenuRepository = orderMenuRepository;
    }

}
