/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 4
*/

import java.util.Scanner;

public class Lab4C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please input a number: ");
        float input = scan.nextFloat();

        System.out.println("What would you like to do to this number: ");
        System.out.println("0) Get the additive inverse of the number");
        System.out.println("1) Get the reciprocal of the number");
        System.out.println("2) Square the number");
        System.out.println("3) Cube the number");
        System.out.println("4) Exit the program");
        int choice = scan.nextInt();
        if (choice > 4)
            choice = 5;
        if (choice < 0)
            choice = 5;

        switch (choice){
            case 0:
                float inverse = input * -1;
                System.out.println("The additive inverse of " + input + " is " + inverse);
                break;
            case 1:
                float third = 1 / input;
                System.out.println("The reciprocal of " + input + " is " + third);
                break;
            case 2:
                float twice = input * input;
                System.out.println("The square of " + input + " is " + twice);
                break;
            case 3:
                float three = input * input * input;
                System.out.println("The cube of " + input + " is " + three);
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            case 5:
                System.out.println("Invalid input, please try again!");

        }
    }
}