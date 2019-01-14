package com.serhat.examples.Composition.Room;

public class Room {
    private int width;
    private int height;
    private String belongsTo;
    private Garderobe garderobe;
    private Bed bed;
    private TV tv;

    public Room(int width, int height, String belongsTo, Garderobe garderobe, Bed bed, TV tv) {
        this.width = width;
        this.height = height;
        this.belongsTo = belongsTo;
        this.garderobe = garderobe;
        this.bed = bed;
        this.tv = tv;
    }

    public void getInfo(){
        System.out.println("Garderobe: "+garderobe.getHeight()+","+garderobe.getSize());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getBelongsTo() {
        return belongsTo;
    }

    public Garderobe getGarderobe() {
        return garderobe;
    }

    public Bed getBed() {
        return bed;
    }

    public TV getTv() {
        return tv;
    }
}
