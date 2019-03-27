package com.serhat.examples.setsAndHashSets;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }
    
    @Override
    public boolean addMoon(HeavenlyBody moon) {
        if (moon.getBodyType() != BodyType.MOON) {
            System.out.println("The only satellites that planets can have are moons");
            return false;
        }
        return super.addMoon(moon);
    }
}
