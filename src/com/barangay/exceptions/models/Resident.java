package com.barangay.models;

import java.util.*;

public class Resident {

    private String id;
    private String name;
    private int age;

    public Resident(String id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setId(String id) {
        if (id == null || id.isBlank())
            throw new IllegalArgumentException("Invalid ID");
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Invalid name");
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    @Override
    public String toString() {
        return id + " - " + name + " (" + age + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resident)) return false;
        Resident r = (Resident) o;
        return id.equals(r.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}