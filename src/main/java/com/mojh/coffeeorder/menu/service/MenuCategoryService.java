package com.mojh.coffeeorder.menu.service;

import com.mojh.coffeeorder.menu.repository.MenuCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuCategoryService {

    private final MenuCategoryRepository menuCategoryRepository;

    public MenuCategoryService(final MenuCategoryRepository menuCategoryRepository) {
        this.menuCategoryRepository = menuCategoryRepository;
    }

}
