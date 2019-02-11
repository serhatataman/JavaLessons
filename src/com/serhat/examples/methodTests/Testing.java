package com.serhat.examples.methodTests;

public class Testing {
    public static void main(String[] args) {
        String str1 = "what the fuck is going on";
        String str2 = "what the fuck";

        String formatted = String.format("%-" + str1.length() + "s", str2);

        System.out.println("The string is: " + formatted + "..." + "\nLength is: " + formatted.length());
    }
}
