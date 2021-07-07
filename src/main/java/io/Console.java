package io;

import java.util.Scanner;

public class Console {

    public static void printWelcome() {
        System.out.println("" +
            "**************************************************\n" +
            "***           Welcome and Bienvenue            ***\n" +
            "***                    to                      ***\n" +
            "***          ZipCo Inventory Manager           ***\n" +
            "**************************************************\n");
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Float userInput = scanner.nextFloat();
        return userInput;
    }
}
