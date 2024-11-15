package com.mojh.coffeeorder.favorite.repository;

import com.mojh.coffeeorder.favorite.domain.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoriteRepository extends JpaRepository<Favorite, Long> {

}
