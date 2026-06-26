package com.barangay.models;

public class Admin extends User {

    public Admin(String id, String name) {
        super(id, name);
    }

    @Override
    public void accessSystem() {
        System.out.println("Admin access: full system control.");
    }

    public void approveRequest() {
        System.out.println("Admin approving request...");
    }
}