package models;

import java.util.List;
import java.util.Optional;
import models.Driver;

public class RideBookingSystem {
    final int RATE_PER_KILOMETER = 8;

    public Optional<Driver> findDriver(List<Driver> drivers, RideRequest request) {
        return drivers.stream().filter(driver -> driver.getRating() >= 4)
                .filter(driver -> request.getRequestedCarModel() == null ||
                        driver.getVehicle().getModel().equals(request.getRequestedCarModel()))
                .sorted((d1, d2) -> Double.compare(d1.getDistanceFromCustomer(), d2.getDistanceFromCustomer())).findFirst();
    }

    public double calculateFare(double distance) {
        return (double) (distance * RATE_PER_KILOMETER);
    }

    public void bookRide(List<Driver> drivers, RideRequest request) {
        Optional<Driver> driverOptional = findDriver(drivers, request);

        if(driverOptional.isEmpty()) {
            System.out.println("Please select another model car. The model you have selected is not available right now!");
        } else {
            double fare = calculateFare(request.getDistanceTOTravel());
            Driver driver = driverOptional.get();
            System.out.println("Ride booked with driver " + driver.getName());
            System.out.println("Car model " + driver.getVehicle().getModel());
            System.out.println("Fare : " + fare + " Rs");
        }
    }
}
