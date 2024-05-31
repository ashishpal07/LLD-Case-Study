package models;

import exceptions.ViewingHourIsInvalid;

public class OTTPlatform {
    private String name;
    private int pricePerUnit;
    private int unitInHours;

    public OTTPlatform(String name, int pricePerUnit, int unitInHours) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.unitInHours = unitInHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getUnitInHours() {
        return unitInHours;
    }

    public void setUnitInHours(int unitInHours) {
        this.unitInHours = unitInHours;
    }
}
