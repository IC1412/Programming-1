/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 5
*/

import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a driving permit (Y/N)?");
        char permit = scan.nextLine().charAt(0);

        if(permit == 'y' || permit == 'Y'){
            System.out.println("Do you have a commercial driving license (Y/N)?");
            char license = scan.nextLine().charAt(0);
            if(license == 'y' || license == 'Y'){
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            } else if (license == 'n' || license == 'N') {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        } else if (permit == 'n' || permit == 'N') {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }

    }
}