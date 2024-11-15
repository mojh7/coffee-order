package com.mojh.coffeeorder.menu.service;

import com.mojh.coffeeorder.menu.repository.MenuOptionRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuOptionService {

    private final MenuOptionRepository menuOptionRepository;

    public MenuOptionService(final MenuOptionRepository menuOptionRepository) {
        this.menuOptionRepository = menuOptionRepository;
    }

}
