package com.serhat.examples.challengeOOP;

public class BaseHamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private Additions additions;
    private int basePrice;

    public BaseHamburger(String breadRollType, String meat, int basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
    }


    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public Additions getAdditions() {
        return additions;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setAdditions(Additions additions) {
        this.additions = additions;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
}
