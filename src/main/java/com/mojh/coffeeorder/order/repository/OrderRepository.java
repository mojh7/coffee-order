package com.mojh.coffeeorder.order.repository;

import com.mojh.coffeeorder.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
