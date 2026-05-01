package com.se1020.carservice.model;

public class Customer extends User {
    public Customer() {
        setRole("customer");
    }

    @Override
    public boolean canOwnVehicle() {
        return true;
    }

    @Override
    public String getResponsibilities() {
        return "Owns vehicles and books appointments";
    }
}
