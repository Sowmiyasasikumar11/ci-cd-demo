package com.example.payment_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @PostMapping
    public String processPayment() {
        return "Payment Successful";
    }
}