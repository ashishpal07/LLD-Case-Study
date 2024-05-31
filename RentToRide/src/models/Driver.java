package models;

public class Driver extends BaseEntity {
    private String name;
    private Vehicle vehicle;
    private double rating;
    private double distanceFromCustomer;

    public Driver(String name, Vehicle vehicle, double rating, double distanceFromCustomer) {
        this.name = name;
        this.vehicle = vehicle;
        this.rating = rating;
        this.distanceFromCustomer = distanceFromCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getDistanceFromCustomer() {
        return distanceFromCustomer;
    }

    public void setDistanceFromCustomer(double distanceFromCustomer) {
        this.distanceFromCustomer = distanceFromCustomer;
    }
}

/**
 * vehicle
 *  - registrationNumber
 *  - modelNumber
 *
 * Driver
 *   - name
 *   - vehicle
 *   - rating
 *   - distanceFromCustomer
 *
 * BookRideRequest
 *    - modelNumber (of vehicle)
 *    - distanceToTravel
 *
 * RideBookingSystem
 *    -
 * */