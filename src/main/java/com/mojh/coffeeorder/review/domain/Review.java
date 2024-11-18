package com.mojh.coffeeorder.review.domain;

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

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Review extends BaseTimeEntity {

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
    private String content;

    @Column(nullable = false)
    private Long rating;

    @Builder
    public Review(User user, Store store, String content, Long rating) {
        this.user = user;
        this.store = store;
        this.content = content;
        this.rating = rating;
    }
}
