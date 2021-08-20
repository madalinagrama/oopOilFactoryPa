package com.codecool.pa.extractors;

public abstract class Extractor {
    private String serialNumber;
    private double capacity;
    private double extractedQuantity;

    public Extractor(String serialNumber, double capacity, double extractedQuantity) {
        this.serialNumber = serialNumber;
        this.capacity = capacity;
        this.extractedQuantity = extractedQuantity;
    }

    public double getExtractionPerformance() {
        return (extractedQuantity / capacity) * 100;
    }

    abstract public boolean reportFaults();

    @Override
    public String toString() {
        return "Extractor{" +
                "serialNumber='" + serialNumber + '\'' +
                ", capacity=" + capacity +
                ", extractedQuantity=" + extractedQuantity +
                '}';
    }
}
