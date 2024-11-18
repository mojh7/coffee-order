package com.mojh.coffeeorder.menu.repository;

import com.mojh.coffeeorder.menu.domain.MenuOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuOptionRepository extends JpaRepository<MenuOption, Long> {

}
