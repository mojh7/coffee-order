package com.mojh.coffeeorder.store.service;


import com.mojh.coffeeorder.store.dto.StoreResponseDto;
import com.mojh.coffeeorder.store.repository.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {

    public final StoreRepository storeRepository;

    public StoreService(final StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Transactional(readOnly = true)
    public List<StoreResponseDto> retrieveStoreList() {
        return storeRepository.findAll().stream()
                              .map(StoreResponseDto::of)
                              .collect(Collectors.toList());
    }
}
