package com.serhat.examples.Composition.Room;

public class TV {
    private int inch;
    private String brand;

    public TV(int inch, String brand) {
        this.inch = inch;
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public String getBrand() {
        return brand;
    }
}
