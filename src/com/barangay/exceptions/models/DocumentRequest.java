package com.barangay.models;

public class DocumentRequest extends BarangayService {

    public DocumentRequest(String id, String name) {
        super(id, name);
    }

    @Override
    public double calculateFee() {
        return 50.0;
    }

    @Override
    public void process() {
        status = ServiceStatus.APPROVED;
        System.out.println("Document request approved.");
    }
}