package com.barangay.models;

public class ClearanceRequest extends BarangayService {

    public ClearanceRequest(String id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFee() {
        return 100.0;
    }

    @Override
    public void process() {
        status = ServiceStatus.APPROVED;
        System.out.println("Clearance request approved.");
    }
}
