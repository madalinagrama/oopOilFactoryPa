package com.codecool.pa.extractors;

public class FixedTerrestrial extends Extractor{
    private final String location;

    public FixedTerrestrial(String serialNumber, double capacity, double extractedQuantity, String location) {
        super(serialNumber, capacity, extractedQuantity);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public boolean reportFaults() {
        return false;
    }
}
