package com.serhat.examples.composition.Room;

public class Garderobe {
    private int size;
    private String height;

    public Garderobe(int size, String height) {
        this.size = size;
        this.height = height;
    }

    public int getSize() {
        return size;
    }

    public String getHeight() {
        return height;
    }
}
