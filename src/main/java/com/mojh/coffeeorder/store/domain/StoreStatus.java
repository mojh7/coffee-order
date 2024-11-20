package com.mojh.coffeeorder.store.domain;

import lombok.Getter;

@Getter
public enum StoreStatus {
    PREPARING("준비중", "영업 준비중 또는 영업 시간 외"),
    OPEN("영업중", "주문 접수 가능 상태"),
    CLOSED("폐업", "영구 영업 중단");

    private final String name;
    private final String description;

    StoreStatus(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean canAcceptOrders() {
        return this == OPEN;
    }

}
