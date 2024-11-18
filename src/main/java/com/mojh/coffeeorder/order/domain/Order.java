package com.mojh.coffeeorder.order.domain;

import com.mojh.coffeeorder.common.entity.BaseTimeEntity;
import com.mojh.coffeeorder.store.domain.Store;
import com.mojh.coffeeorder.user.domain.User;
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
public class Order extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private Store store;

    @Column(length = 45, nullable = false)
    private String request;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal totalPrice;

    @Column(length = 45, nullable = false)
    private String status;

    @Builder
    public Order(User user, Store store, String request, BigDecimal totalPrice, String status) {
        this.user = user;
        this.store = store;
        this.request = request;
        this.totalPrice = totalPrice;
        this.status = status;
    }

}
