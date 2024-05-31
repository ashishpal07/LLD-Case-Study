import models.RideBookingSystem;
import models.RideRequest;
import models.Vehicle;
import models.Driver;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("SEDAN", "MH 05 3229");
        Vehicle v2 = new Vehicle("BIKE", "MH 05 3829");
        Vehicle v3 = new Vehicle("SEDAN", "MH 04 7829");
        Vehicle v4 = new Vehicle("SEDAN", "MH 03 9029");
        Vehicle v5 = new Vehicle("SEDAN", "MH 05 8339");

        List<Vehicle> vehicles = Arrays.asList(v1, v2, v3, v4, v5);

        Driver d1 = new Driver("John", v1, 4.5, 2.0);
        Driver d2 = new Driver("Doe", v2, 3.9, 1.5);
        Driver d3 = new Driver("Smith", v3, 4.2, 3.0);
        Driver d4 = new Driver("Jane", v4, 4.8, 2.5);

        List<Driver> drivers = Arrays.asList(d1, d2, d3, d4);

        RideRequest request = new RideRequest("SEDAN", 10);

        RideBookingSystem rideBook = new RideBookingSystem();
        rideBook.bookRide(drivers, request);
    }
}