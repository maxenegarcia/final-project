package com.barangay.services;

import com.barangay.models.Resident;
import com.barangay.models.BarangayService;
import com.barangay.models.ServiceStatus;

import java.util.List;

public class ReportService {

    private List<Resident> residents;
    private List<BarangayService> requests;

    public ReportService(List<Resident> residents, List<BarangayService> requests) {
        this.residents = residents;
        this.requests = requests;
    }

    // ================= MAIN REPORT =================
    public void generateSummary() {

        System.out.println("\n==============================");
        System.out.println("      SYSTEM REPORT");
        System.out.println("==============================");

        System.out.println("Total Residents: " + getTotalResidents());
        System.out.println("Total Requests: " + getTotalRequests());
        System.out.println("Pending Requests: " + getByStatus(ServiceStatus.PENDING));
        System.out.println("Approved Requests: " + getByStatus(ServiceStatus.APPROVED));
        System.out.println("Released Requests: " + getByStatus(ServiceStatus.RELEASED));

        System.out.println("\nTop Active Resident:");
        printMostActiveResident();
    }

    // ================= STATS =================
    public int getTotalResidents() {
        return residents.size();
    }

    public int getTotalRequests() {
        return requests.size();
    }

    public long getByStatus(ServiceStatus status) {
        return requests.stream()
                .filter(r -> r.getStatus() == status)
                .count();
    }

    // ================= SIMPLE ANALYTICS =================
    private void printMostActiveResident() {

        if (residents.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        Resident top = residents.get(0);

        System.out.println(top.getName());
    }
}