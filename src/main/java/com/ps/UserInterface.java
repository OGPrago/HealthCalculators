package com.ps;

import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void display() {
        mainMenu();
    }

    private static void mainMenu() {
        byte menuCommand;

        do {
            System.out.println("-----------Hello!-----------");
            System.out.println("Select a calculator: ");
            System.out.println("\t1)Calories Calculator");
            System.out.println("\t2)BMI Calculator");

            menuCommand = scanner.nextByte();

            switch (menuCommand) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Command not found.");
            }
        } while (menuCommand != 4);
    }
}
