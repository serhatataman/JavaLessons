package com.serhat.examples.challengeOOP;

public class Main {
    public static void main(String[] args) {
        Additions additionsForHealthyBurger = new Additions();
        additionsForHealthyBurger.setEachAdditionCost(2);
        additionsForHealthyBurger.setNumberOfCarrot(3);
        additionsForHealthyBurger.setNumberOfLettuce(2);
        additionsForHealthyBurger.setNumberOfTomato(5);

        HealthyBurger healthyBurger = new HealthyBurger("Brown Rye Bread", "Chicken", 7);
        healthyBurger.setName("Healthy Burger");
        healthyBurger.setCorns(2);
        healthyBurger.setCucumber(1);
        healthyBurger.setAdditions(additionsForHealthyBurger);

        Additions additionsForDeluxeBurger = new Additions();
        additionsForDeluxeBurger.setEachAdditionCost(7);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Burger", "Goat", 24);
        deluxeBurger.setName("Deluxe Burger");
        deluxeBurger.setAdditions(additionsForDeluxeBurger);

        healthyBurger.getReceipt();
        deluxeBurger.getReceipt();
    }
}
