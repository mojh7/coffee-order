package com.mojh.coffeeorder.order.domain;

import com.mojh.coffeeorder.common.entity.BaseTimeEntity;
import com.mojh.coffeeorder.menu.domain.Menu;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderMenu extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @Column(nullable = false)
    private Long count;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal price;


    @Builder
    public OrderMenu(Order order, Menu menu, Long count, BigDecimal price) {
        this.order = order;
        this.menu = menu;
        this.count = count;
        this.price = price;
    }
}