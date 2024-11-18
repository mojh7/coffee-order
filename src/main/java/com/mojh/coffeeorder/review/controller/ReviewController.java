package com.mojh.coffeeorder.review.controller;

import com.mojh.coffeeorder.review.service.ReviewService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(final ReviewService reviewService) {
        this.reviewService = reviewService;
    }
}
