package com.mojh.coffeeorder.owner.service;

import com.mojh.coffeeorder.owner.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
    private final OwnerRepository ownerRepository;

    public OwnerService(final OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

}