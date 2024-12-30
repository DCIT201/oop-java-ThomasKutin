package com.mysystem;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Vehicle> fleet = new ArrayList<>();

    public List<Vehicle> getFleet() {
        return new ArrayList<>(fleet); // Return a copy to maintain encapsulation
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        vehicle.rent(customer, days);
    }

    public void returnVehicle(Vehicle vehicle, Customer customer) {
        vehicle.returnVehicle();
        customer.removeCurrentRental(vehicle);
    }
}