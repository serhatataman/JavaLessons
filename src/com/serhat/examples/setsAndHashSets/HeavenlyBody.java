package com.serhat.examples.setsAndHashSets;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;
    
    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }
    
    public String getName() {
        return name;
    }
    
    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }
    
    public BodyType getBodyType() {
        return bodyType;
    }
    
    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
        if (!(obj instanceof HeavenlyBody)) {
            return false;
        }
        
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName) && (this.bodyType == ((HeavenlyBody) obj).bodyType);
        
//        return this.name.equals(objName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, orbitalPeriod, satellites, bodyType);
    }
}

enum BodyType {
    STAR,
    PLANET,
    MOON
}