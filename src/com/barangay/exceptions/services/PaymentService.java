package com.barangay.services;

public class PaymentService {

    public void processPayment(double amount) {
        System.out.println("Processing CASH payment: " + amount);
    }

    public void processPayment(double amount, String ref) {
        System.out.println("Processing GCASH payment: " + ref);
    }
}