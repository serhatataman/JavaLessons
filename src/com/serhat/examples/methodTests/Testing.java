package com.serhat.examples.methodTests;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
    
        String[] parts = "run North".split(" ");
        System.out.println(Arrays.stream(parts).filter(part -> part.equalsIgnoreCase("north")).count());
    }
}