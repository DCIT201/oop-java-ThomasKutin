package com.mysystem;

public class Main {
    public static void main(String[] args) {
        // Example usage
        RentalAgency agency = new RentalAgency();
        Customer customer = new Customer("Thomas Kutin");

        Vehicle car = new Car("1", "Toyota Camry", 50.0);
        Vehicle motorcycle = new Motorcycle("2", "Harley Davidson", 30.0);
        Vehicle truck = new Truck("3", "Ford F-150", 70.0);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        agency.rentVehicle(car, customer, 5);
        agency.returnVehicle(car, customer);
    }
}