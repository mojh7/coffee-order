package com.mojh.coffeeorder.owner.repository;

import com.mojh.coffeeorder.owner.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
