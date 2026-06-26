package com.barangay.services;

import com.barangay.models.Resident;
import com.barangay.models.BarangayService;
import com.barangay.models.ServiceStatus;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {

    // ================= RESIDENT SEARCH =================
    public List<Resident> searchResidentByName(List<Resident> residents, String keyword) {
        return residents.stream()
                .filter(r -> r.getName().toLowerCase()
                .contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Resident> searchResidentById(List<Resident> residents, String id) {
        return residents.stream()
                .filter(r -> r.getId().equalsIgnoreCase(id))
                .collect(Collectors.toList());
    }

    // ================= REQUEST SEARCH =================
    public List<BarangayService> searchRequestsByStatus(
            List<BarangayService> requests,
            ServiceStatus status
    ) {
        return requests.stream()
                .filter(r -> r.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<BarangayService> searchRequestByName(
            List<BarangayService> requests,
            String keyword
    ) {
        return requests.stream()
                .filter(r -> r.getResidentName().toLowerCase()
                .contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
}