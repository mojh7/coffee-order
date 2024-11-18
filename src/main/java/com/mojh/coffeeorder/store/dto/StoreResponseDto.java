package com.mojh.coffeeorder.store.dto;

import lombok.Getter;

@Getter
public class StoreResponseDto {
    public int id;
    public String name;
    public String address;
    public int distance;

    public StoreResponseDto(int id, String name, String address, int distance) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.distance = distance;
    }
}
