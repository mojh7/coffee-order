package com.mojh.coffeeorder.store.service;


import com.mojh.coffeeorder.store.repository.StoreRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    public final StoreRepository storeRepository;

    public StoreService(final StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }


}
