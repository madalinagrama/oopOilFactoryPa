package com.codecool.pa.extractors;

public class MobileTerrestrial extends Extractor{

    private String location;

    public MobileTerrestrial(String serialNumber, double capacity, double extractedQuantity, String location) {
        super(serialNumber, capacity, extractedQuantity);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



    @Override
    public boolean reportFaults() {
        return getExtractionPerformance() < 25;
    }
}
