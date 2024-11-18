package com.mojh.coffeeorder.order.service;

import com.mojh.coffeeorder.order.repository.OrderMenuDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderMenuDetailService {

    private final OrderMenuDetailRepository orderMenuDetailRepository;

    public OrderMenuDetailService(final OrderMenuDetailRepository orderMenuDetailRepository) {
        this.orderMenuDetailRepository = orderMenuDetailRepository;
    }

}
