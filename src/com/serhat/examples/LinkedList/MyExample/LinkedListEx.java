package com.serhat.examples.LinkedList.MyExample;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println("Enter object names:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        while (!str.isEmpty()) {
            addInOrder(linkedList, str);
            str = scanner.nextLine();
        }

        System.out.println(linkedList);
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newEntity) {

        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {

            int compare = listIterator.next().compareTo(newEntity);

            if (compare == 0) {
                System.out.println("Entity already exists!");
                return false;
            } else if (compare > 0) {
                listIterator.previous();
                listIterator.add(newEntity);
                return true;
            } else if (compare < 0) {
                // Move on the next city.
            }
        }
        listIterator.add(newEntity);
        return true;
    }
}
