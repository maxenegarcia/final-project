package com.barangay.payments;

import com.barangay.interfaces.Payment;

public class GCashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid GCASH: " + amount);
    }
}