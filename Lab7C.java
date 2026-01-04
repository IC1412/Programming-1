/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 7
*/

import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size:");
        int n = scan.nextInt();
        System.out.println("This is the requested "+n+"x"+n+" right-triangle:");


        for(int i = 0; i<n; i++) {
            for(int a = n-1; a > i; a--) {
                System.out.print(" ");
            }
            for(int j=0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}