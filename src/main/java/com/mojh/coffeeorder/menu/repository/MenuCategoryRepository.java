package com.mojh.coffeeorder.menu.repository;

import com.mojh.coffeeorder.menu.domain.MenuCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuCategoryRepository extends JpaRepository<MenuCategory, Long> {

}
