/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 3
*/

import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float TH;
        float TQ;
        System.out.print("Course 1 hours: ");
        float Hone = scan.nextFloat();
        System.out.print("Grade for course 1: ");
        float Qone = Hone * scan.nextFloat();
        System.out.print("Course 2 hours: ");
        float Htwo = scan.nextFloat();
        System.out.print("Grade for course 2: ");
        float Qtwo = Htwo * scan.nextFloat();
        System.out.print("Course 3 hours: ");
        float Hthree = scan.nextFloat();
        System.out.print("Grade for course 3: ");
        float Qthree = Hthree * scan.nextFloat();
        System.out.print("Course 4 hours: ");
        float Hfour = scan.nextFloat();
        System.out.print("Grade for course 4: ");
        float Qfour = Hfour * scan.nextFloat();

        TH = Hone + Htwo + Hthree + Hfour;
        TQ = Qone + Qtwo + Qthree + Qfour;

        float GPA = TQ / TH;
        System.out.println("Total hours is: " + TH);
        System.out.println("Total quality points is: " + TQ);
        System.out.println("Your GPA for this semester is " + GPA);
    }
}