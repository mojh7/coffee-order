package com.mojh.coffeeorder.payment.controller;

import com.mojh.coffeeorder.payment.service.PaymentService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(final PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}
