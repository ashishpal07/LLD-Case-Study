package models;

public abstract class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehichle vehichle;

    abstract boolean getIsEmpty();
}
