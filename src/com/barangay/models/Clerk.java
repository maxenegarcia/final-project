package com.barangay.models;

public class Clerk extends User {

    public Clerk(String id, String name) {
        super(id, name);
    }

    @Override
    public void accessSystem() {
        System.out.println("Clerk access: limited processing functions only.");
    }

    public void processRequest() {
        System.out.println("Clerk processing request...");
    }
}
