package com.serhat.examples.ChallengeOOP;

public class DeluxeBurger extends BaseHamburger {

    private int chips;
    private int drinks;

    public DeluxeBurger(String breadRollType, String meat, int basePrice){
        super(breadRollType,meat,basePrice);
        this.chips = 2;
        this.drinks = 1;
    }

    public void getReceipt() {
        System.out.println("\nHamburger name: " + super.getName());
        System.out.println("Additions:\n"
                + "Chips: " + this.chips + "\n"
                + "Drinks: " + this.drinks);
        System.out.println("Each one of additions costs " + super.getAdditions().getEachAdditionCost() + " dollars.");
        System.out.println("Total price: " + (super.getBasePrice()
                + super.getAdditions().getEachAdditionCost()
                * (this.chips + this.drinks)));
    }
}
