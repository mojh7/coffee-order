package com.mojh.coffeeorder.menu.service;

import com.mojh.coffeeorder.menu.repository.MenuOptionGroupRepository;
import org.springframework.stereotype.Service;

@Service
public class MenuOptionGroupService {

    private final MenuOptionGroupRepository menuOptionGroupRepository;

    public MenuOptionGroupService(final MenuOptionGroupRepository menuOptionGroupRepository) {
        this.menuOptionGroupRepository = menuOptionGroupRepository;
    }

}
