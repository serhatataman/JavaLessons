package com.serhat.examples.Composition.Room;

public class Bed {
    private boolean hasSheets;
    private boolean isClean;

    public Bed(boolean hasSheets, boolean isClean) {
        this.hasSheets = hasSheets;
        this.isClean = isClean;
    }

    public boolean isHasSheets() {
        return hasSheets;
    }

    public boolean isClean() {
        return isClean;
    }
}
