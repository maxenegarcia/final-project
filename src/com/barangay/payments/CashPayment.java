package com.barangay.payments;

import com.barangay.interfaces.Payment;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid CASH: " + amount);
    }
}