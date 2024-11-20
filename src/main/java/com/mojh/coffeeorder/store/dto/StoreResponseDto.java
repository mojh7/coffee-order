package com.mojh.coffeeorder.store.dto;

import com.mojh.coffeeorder.store.domain.Store;
import com.mojh.coffeeorder.store.domain.StoreStatus;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StoreResponseDto {
    private Long id;
    private String name;
    private String ownerName;
    private String address;
    private StoreStatus status;

    @Builder
    public StoreResponseDto(Long id, String name, String ownerName,
                            String address, StoreStatus status) {
        this.id = id;
        this.name = name;
        this.ownerName = ownerName;
        this.address = address;
        this.status = status;
    }

    public static StoreResponseDto of(Store store) {
        return StoreResponseDto.builder()
                               .id(store.getId())
                               .name(store.getName())
                               .ownerName(store.getOwner().getName())
                               .address(store.getAddress())
                               .status(store.getStatus())
                               .build();
    }
}