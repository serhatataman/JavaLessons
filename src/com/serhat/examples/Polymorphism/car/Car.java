package com.serhat.examples.Polymorphism.car;

class Ferrari extends Car{
    public Ferrari(){
        super("Ferrari", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari's engine has started!");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari is slowing down...");
    }

    public void getAdditionalInfo(){
        System.out.println("Ferrari's engine is working: "+super.getEngine());
        System.out.println("Ferraris's wheels are: "+super.getWheels());
    }
}

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("Engine has started!");
    }

    public void accelerate(){
        System.out.println("Accelerating...");
    }

    public void brake(){
        System.out.println("Slowing down...");
    }
}

class Main{
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.getAdditionalInfo();
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();
}
}