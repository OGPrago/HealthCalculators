package com.ps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void display() {
        mainMenu();
    }

    private static void mainMenu() {
        byte menuCommand = 0;

        do {
            System.out.println("-----------Hello!-----------");
            System.out.println("Select a calculator: ");
            System.out.println("\t1)Calories Calculator");
            System.out.println("\t2)BMI Calculator");
            System.out.println("\t3) Body Fat Calculator");
            System.out.println("\t4)BMR Calculator");
            System.out.println("\t5 Exit");

            try {
                menuCommand = scanner.nextByte();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Misinput? ¬‿¬");
                scanner.next();
                continue;
            }

            switch (menuCommand) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Command not found.");
            }
        } while (menuCommand != 5);
    }
}
