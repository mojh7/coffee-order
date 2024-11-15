package com.mojh.coffeeorder.user.repository;


import com.mojh.coffeeorder.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
