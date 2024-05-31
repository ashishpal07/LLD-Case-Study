package models;

public class Handicapped extends ParkingSpot {
    @Override
    boolean getIsEmpty() {
        return false;
    }
}
