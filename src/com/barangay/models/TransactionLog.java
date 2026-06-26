package com.barangay.models;

import java.time.LocalDateTime;

public class TransactionLog {

    private String action;
    private LocalDateTime timestamp;

    public TransactionLog(String action) {
        this.action = action;
        this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return action + " at " + timestamp;
    }
}