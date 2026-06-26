package com.barangay.services;

import com.barangay.models.*;

import java.util.ArrayList;
import java.util.List;

public class RequestService {

    private List<BarangayService> requests = new ArrayList<>();

    public void add(BarangayService r) {
        requests.add(r);
    }

    public List<BarangayService> getAll() {
        return requests;
    }

    public void approve(String id) {
        for (BarangayService r : requests) {
            if (r.getId().equals(id)) {
                r.process();
            }
        }
    }
}
