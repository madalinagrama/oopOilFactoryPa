package com.codecool.pa.workers;


public class Worker {
    private String name;
    private Position position;
    private int daysOnPlatform;

    public Worker(String name, Position position, int daysOnPlatform) {
        this.name = name;
        this.position = position;
        this.daysOnPlatform = daysOnPlatform;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public int getDaysOnPlatform() {
        return daysOnPlatform;
    }
}
