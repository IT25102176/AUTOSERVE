package com.se1020.carservice.model;

public class Admin extends User {
    public Admin() {
        setRole("admin");
    }

    @Override
    public String getResponsibilities() {
        return "Manages system users and access settings";
    }
}
