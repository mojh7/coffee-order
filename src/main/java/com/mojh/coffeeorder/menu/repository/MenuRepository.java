package com.mojh.coffeeorder.menu.repository;

import com.mojh.coffeeorder.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
