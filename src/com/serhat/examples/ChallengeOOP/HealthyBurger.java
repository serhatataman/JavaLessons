package com.serhat.examples.ChallengeOOP;

public class HealthyBurger extends BaseHamburger {

    private int cucumber;
    private int corns;

    public HealthyBurger(String breadRollType, String meat, int basePrice) {
        super(breadRollType, meat, basePrice);
    }

    public void getReceipt() {
        System.out.println("Hamburger name: " + super.getName());
        System.out.println("Additions:\n"
                + "Lettuce: " + super.getAdditions().getNumberOfLettuce() + "\n"
                + "Tomato: " + super.getAdditions().getNumberOfTomato() + "\n"
                + "Carrot: " + super.getAdditions().getNumberOfCarrot() + "\n"
                + "Cucumber: " + this.getCucumber() + "\n"
                + "Corns: " + this.getCorns());
        System.out.println("Each one of additions costs " + super.getAdditions().getEachAdditionCost() + " dollars.");
        System.out.println("Total price: " + (super.getBasePrice()
                + super.getAdditions().getEachAdditionCost()
                * (this.getCorns()
                + this.getCucumber()
                + super.getAdditions().getNumberOfCarrot()
                + super.getAdditions().getNumberOfLettuce()
                + super.getAdditions().getNumberOfTomato())));
    }

    public int getCucumber() {
        return cucumber;
    }

    public int getCorns() {
        return corns;
    }

    public void setCucumber(int cucumber) {
        this.cucumber = cucumber;
    }

    public void setCorns(int corns) {
        this.corns = corns;
    }
}
