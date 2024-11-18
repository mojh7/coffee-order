package com.mojh.coffeeorder.review.service;

import com.mojh.coffeeorder.review.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(final ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
}