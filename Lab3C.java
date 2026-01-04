/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 3
*/

import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of quarters: ");
        int qn = scan.nextInt();
        System.out.println("Enter the number of dimes: ");
        int dn = scan.nextInt();
        System.out.println("Enter the number of nickels: ");
        int nn = scan.nextInt();
        System.out.println("Enter the number of pennies: ");
        int pn = scan.nextInt();

        int quarter = qn * 25;
        int dimes = dn * 10;
        int nickels = nn * 5;

        int total = quarter + dimes + nickels + pn;
        int dollars = total / 100;
        int cents = total - (dollars * 100);

        System.out.println("You entered " + qn + " quarters.");
        System.out.println("You entered " + dn + " dimes.");
        System.out.println("You entered " + nn + " nickels.");
        System.out.println("You entered " + pn + " pennies.");
        System.out.println("Your total is " + dollars + " dollars and " + cents + " cents.");
    }
}