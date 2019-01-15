package com.serhat.examples.abstraction;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // In here we basically say that if a class inherits from this class, it has to implement these methods.
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
