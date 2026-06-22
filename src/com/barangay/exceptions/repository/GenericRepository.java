package com.barangay.repository;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository<T> {

    private List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
}