package com.mojh.coffeeorder.store.controller;

import com.mojh.coffeeorder.store.dto.StoreResponseDto;
import com.mojh.coffeeorder.store.service.StoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(final StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/stores")
    public ResponseEntity<List<StoreResponseDto>> retrieveStoreList() {
        List<StoreResponseDto> stores = storeService.retrieveStoreList();
        return ResponseEntity.ok(stores);
    }

}