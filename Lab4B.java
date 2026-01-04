/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 4
*/

import java.util.Scanner;

public class Lab4B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Day: ");
        String date = scan.next();

        switch(date){
            case "Monday", "monday", "Wednesday", "wednesday":
                System.out.println("I have class today!");
                break;
            case "Friday", "friday":
                System.out.println("It's Friday! Friday! Gotta get down on Friday!");
                break;
            case "Tuesday", "tuesday", "Thursday", "thursday", "Saturday", "saturday", "Sunday", "sunday":
                System.out.println("I should use this time to do my homework.");
                break;
        }
    }
}