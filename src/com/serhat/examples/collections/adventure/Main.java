package com.serhat.examples.collections.adventure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
        
        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("N", 5);
        tempExit.put("S", 4);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
        
        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        tempExit.put("Q", 0);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
        
        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
        
        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("N", 1);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
    
        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
        
        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            
            String direction = scanner.nextLine().toUpperCase();
            if (direction.equalsIgnoreCase("N") || Arrays.stream(direction.split(" ")).anyMatch(part -> part.equalsIgnoreCase("North"))) {
                if (exits.containsKey("N")) {
                    loc = exits.get("N");
                } else {
                    System.out.println("There is no way to North");
                }
            } else if (direction.equalsIgnoreCase("S") || Arrays.stream(direction.split(" ")).anyMatch(part -> part.equalsIgnoreCase("South"))) {
                if (exits.containsKey("S")) {
                    loc = exits.get("S");
                } else {
                    System.out.println("There is no way to South");
                }
            } else if (direction.equalsIgnoreCase("E") || Arrays.stream(direction.split(" ")).anyMatch(part -> part.equalsIgnoreCase("East"))) {
                if (exits.containsKey("E")) {
                    loc = exits.get("E");
                } else {
                    System.out.println("There is no way to East");
                }
            } else if (direction.equalsIgnoreCase("W") || Arrays.stream(direction.split(" ")).anyMatch(part -> part.equalsIgnoreCase("West"))) {
                if (exits.containsKey("W")) {
                    loc = exits.get("W");
                } else {
                    System.out.println("There is no way to West");
                }
            } else if (direction.equalsIgnoreCase("Q") || Arrays.stream(direction.split(" ")).anyMatch(part -> part.equalsIgnoreCase("Quit"))) {
                loc = 0;
            }
            else {
                System.out.println("Invalid direction");
            }
        }
    }
}
