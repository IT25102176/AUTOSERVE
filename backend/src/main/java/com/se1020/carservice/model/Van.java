package com.se1020.carservice.model;

public class Van extends Vehicle {
    public Van() {
        setVehicleType("van");
    }

    @Override
    public String getMaintenanceProfile() {
        return "Heavy-load maintenance checks";
    }
}
