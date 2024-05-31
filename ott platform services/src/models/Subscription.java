package models;

import exceptions.ViewingHourIsInvalid;

public class Subscription {
    private OTTPlatform ottPlatform;
    private int viewingHours;

    public Subscription(OTTPlatform ottPlatform, int viewingHours) throws ViewingHourIsInvalid {
        if(
                viewingHours % ottPlatform.getUnitInHours() != 0
                && ottPlatform.getUnitInHours() % viewingHours != 0
        ) {
            throw new ViewingHourIsInvalid("Viewing hours should be multiple of unit hours in " + ottPlatform.getName());
        }
        this.ottPlatform = ottPlatform;
        this.viewingHours = viewingHours;
    }

    public OTTPlatform getOttPlatform() {
        return ottPlatform;
    }

    public void setOttPlatform(OTTPlatform ottPlatform) {
        this.ottPlatform = ottPlatform;
    }

    public int getViewingHours() {
        return viewingHours;
    }

    public void setViewingHours(int viewingHours) {
        this.viewingHours = viewingHours;
    }

    public double calculatePrice() {
        return ((double) this.viewingHours / ottPlatform.getUnitInHours()) * ottPlatform.getPricePerUnit();
    }
}
