package com.mojh.coffeeorder.order.repository;

import com.mojh.coffeeorder.order.domain.OrderMenuDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMenuDetailRepository extends JpaRepository<OrderMenuDetail, Long> {

}
