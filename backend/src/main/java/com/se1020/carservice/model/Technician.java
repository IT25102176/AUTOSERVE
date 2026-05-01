package com.se1020.carservice.model;

public class Technician extends User {
    public Technician() {
        setRole("technician");
    }

    @Override
    public boolean canBeAssignedAsTechnician() {
        return true;
    }

    @Override
    public String getResponsibilities() {
        return "Handles vehicle diagnostics and repair work";
    }
}
