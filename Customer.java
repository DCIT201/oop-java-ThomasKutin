package com.mysystem;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Vehicle> rentalHistory = new ArrayList<>();
    private final List<Vehicle> currentRentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getRentalHistory() {
        return new ArrayList<>(rentalHistory); // Return a copy to maintain encapsulation
    }

    public List<Vehicle> getCurrentRentals() {
        return new ArrayList<>(currentRentals); // Return a copy to maintain encapsulation
    }

    public void addRentalHistory(Vehicle vehicle) {
        rentalHistory.add(vehicle);
    }

    public void addCurrentRental(Vehicle vehicle) {
        currentRentals.add(vehicle);
    }

    public void removeCurrentRental(Vehicle vehicle) {
        currentRentals.remove(vehicle);
        addRentalHistory(vehicle);
    }
}