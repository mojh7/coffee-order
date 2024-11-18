package com.mojh.coffeeorder.order.repository;

import com.mojh.coffeeorder.order.domain.OrderMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMenuRepository extends JpaRepository<OrderMenu, Long> {

}
