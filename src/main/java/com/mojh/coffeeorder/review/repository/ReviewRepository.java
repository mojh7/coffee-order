package com.mojh.coffeeorder.review.repository;

import com.mojh.coffeeorder.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
