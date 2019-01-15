package com.serhat.examples.composition.Room;

public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(true, false);
        Garderobe garderobe = new Garderobe(13, "100 litre");

        Room room = new Room(30, 3, "Serhat", garderobe, bed, new TV(40, "Samsung"));

        room.getInfo();
    }
}
