package com.serhat.examples.abstraction.abstractionChallenge.mySolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Items items = new Items();
        boolean loop = true;

        while (loop) {
            if (items.getCurrent() != null) {
                System.out.println("At entity: " + items.getCurrent());
            }
            showMenu();

            switch (input.nextInt()) {
                case 1:
                    if (items.size() == 0) {
                        System.out.println("List is empty!");
                        continue;
                    }
                    if (items.getNext() == null) {
                        System.out.println("End of the list");
                    }
                    break;
                case 2:
                    if (items.size() == 0) {
                        System.out.println("List is empty!");
                        continue;
                    }
                    if (items.getPrevious() == null) {
                        System.out.println("Beginning of the list");
                    }
                    break;
                case 3:
                    System.out.println("Type a value: ");
                    items.addNode(input.next());
                    break;
                case 4:
                    items.showList();
                    break;
                case 7:
                    loop = false;
                    System.out.println("See you next time :)");
                    break;
                default:
                    System.out.println("Invalid option...");
            }
        }

//        items.addNode("Here");
//        items.addNode("There");
//        items.addNode("With");
//        items.addNode("Me");
//        items.addNode("You");
//        items.addNode("97");
//        items.addNode("Adele");
//        items.addNode("Adele");
//        items.addNode("Serhad");
//        items.addNode("Ben");
//        items.addNode(5);
//        items.addNode(1);
//        items.addNode("X");
//        items.addNode(1);
//        items.addNode(7);
//        items.showList();

    }


    public static void showMenu() {
        System.out.println("Menu:\n" +
                "1 - Move to next entity\n" +
                "2 - Move to previous entity\n" +
                "3 - Add entity\n" +
                "4 - Show List\n" +
                "7 - Exit\n");
    }
}
