package com.mojh.coffeeorder.store.repository;

import com.mojh.coffeeorder.store.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StoreRepository extends JpaRepository<Store, Long> {


}