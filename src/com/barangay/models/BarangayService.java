package com.barangay.models;

public abstract class BarangayService {

    protected String id;
    protected String residentName;
    protected ServiceStatus status;

    public BarangayService(String id, String residentName) {
        this.id = id;
        this.residentName = residentName;
        this.status = ServiceStatus.PENDING;
    }

    public abstract double calculateFee();
    public abstract void process();

    public String getId() {
        return id;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public String getResidentName() {
        return residentName;
    }
}