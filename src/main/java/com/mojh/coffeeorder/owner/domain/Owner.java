package com.mojh.coffeeorder.owner.domain;

import com.mojh.coffeeorder.common.entity.BaseTimeEntity;
import com.mojh.coffeeorder.store.domain.Store;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Owner extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 45, nullable = false)
    private String bizNum;

    @Column(length = 45, nullable = false)
    private String account;

    @Column(length = 45, nullable = false)
    private String password;

    @Column(length = 45, nullable = false)
    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Store> stores = new ArrayList<>();

    @Builder
    public Owner(String bizNum, String account, String password, String name) {
        this.bizNum = bizNum;
        this.account = account;
        this.password = password;
        this.name = name;
    }
}
