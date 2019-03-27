package com.serhat.examples.setsAndHashSets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("Duplicates")
public class SetChallenge {
    
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    
    public static void main(String[] args) {
        
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        temp = new HeavenlyBody("Venus", 225, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        temp = new HeavenlyBody("Earth", 365, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);
        
        temp = new HeavenlyBody("Mars", 687, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        tempMoon = new HeavenlyBody("Deimos", 1.3, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars
        
        tempMoon = new HeavenlyBody("Phobos", 0.3, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars
        
        temp = new HeavenlyBody("Jupiter", 4332, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        tempMoon = new HeavenlyBody("Io", 1.8, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter
        
        tempMoon = new HeavenlyBody("Europa", 3.5, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter
        
        tempMoon = new HeavenlyBody("Ganymede", 7.1, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter
        
        tempMoon = new HeavenlyBody("Callisto", 16.7, BodyType.MOON);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter
        
        temp = new HeavenlyBody("Saturn", 10759, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        temp = new HeavenlyBody("Uranus", 30660, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        temp = new HeavenlyBody("Neptune", 165, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        temp = new HeavenlyBody("Pluto", 248, BodyType.PLANET);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }
        
        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoon : body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }
        
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        
        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }
        
        
        HeavenlyBody neptune = new Planet("Neptune", 842);
        planets.add(neptune);
    
        System.out.println("After adding neptune to planets:");
        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
        
        System.out.println("Second answer is->" + (neptune.equals(solarSystem.get("Mars")) == solarSystem.get("Mars").equals(neptune)));
    
        System.out.println("After adding neptune to solar system: ");
        solarSystem.put(neptune.getName(), neptune);
        solarSystem.forEach((str, bod) ->
                System.out.println("Key-> '" + str + "' - Name->'" + bod.getName() + "' - OrbitalPeriod-> '"+bod.getOrbitalPeriod()+"'"));
    
        HeavenlyBody neptuneMoon = new Moon("Neptune", 199);
        planets.add(neptuneMoon);
    
        System.out.println("After adding neptuneMoon to planets:");
        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
        
        
    }
}
