package com.barangay.services;

import com.barangay.models.Resident;

import java.util.*;
import java.util.stream.Collectors;

public class ResidentService {

    private List<Resident> residents = new ArrayList<>();

    public void add(Resident r) {
        residents.add(r);
    }

    public List<Resident> getAll() {
        return residents;
    }

    public List<Resident> search(String keyword) {
        return residents.stream()
                .filter(r -> r.getName().toLowerCase()
                .contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void sortByName() {
        residents.sort(Comparator.comparing(Resident::getName));
    }
}