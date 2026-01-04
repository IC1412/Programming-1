/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 3
*/

import java.util.Scanner;

public class Lab3A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float amountOwed;
        float APR;
        System.out.println("Amount owed: $");
        amountOwed = scan.nextFloat();
        System.out.println("APR: ");
        APR = scan.nextFloat();

        float mpr = (APR / 12) * 1000;
        float Minp = (amountOwed * (APR / 100) / 12) * 100;
        float MPR = Math.round(mpr);
        float minp = Math.round(Minp);

        System.out.println("Monthly percentage rate: " + MPR/1000);
        System.out.println("Minimum payment: $" + minp/100);

    }
}