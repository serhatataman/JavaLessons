package com.serhat.examples.generics.part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Raw type ArayList and it is not recommended to use!
//        ArrayList items = new ArrayList();

        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("Tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items) {
//        for (Object i : items) {
//            System.out.println((Integer) i * 2);
//        }

        for (int i : items) {
            System.out.println(i *2);
        }
    }
}
