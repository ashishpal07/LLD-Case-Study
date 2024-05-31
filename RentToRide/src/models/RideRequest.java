package models;

public class RideRequest {
    private String requestedCarModel;
    private double distanceTOTravel;

    public RideRequest(String requestedCarModel, double distanceTOTravel) {
        this.requestedCarModel = requestedCarModel;
        this.distanceTOTravel = distanceTOTravel;
    }

    public String getRequestedCarModel() {
        return requestedCarModel;
    }

    public void setRequestedCarModel(String requestedCarModel) {
        this.requestedCarModel = requestedCarModel;
    }

    public double getDistanceTOTravel() {
        return distanceTOTravel;
    }

    public void setDistanceTOTravel(double distanceTOTravel) {
        this.distanceTOTravel = distanceTOTravel;
    }
}
