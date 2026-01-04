/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 4
*/

import java.util.Scanner;

public class Lab4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Score of your Exam: ");
        float score = scan.nextFloat();

        if(score >= 97.5){
            System.out.println("Letter Grade is: A+");
        }else if(score >= 94.5){
            System.out.println("Letter Grade is: A");
        }else if(score >= 91.5){
            System.out.println("Letter Grade is: A-");
        }else if(score >= 88.5){
            System.out.println("Letter Grade is: B+");
        }else if(score >= 85.5){
            System.out.println("Letter Grade is: B");
        }else if(score >= 82.5){
            System.out.println("Letter Grade is: B-");
        }else if(score >= 79.5){
            System.out.println("Letter Grade is: C+");
        }else if(score >= 76.5){
            System.out.println("Letter Grade is: C");
        }else if(score >= 73.5){
            System.out.println("Letter Grade is: C-");
        }else if(score >= 70.5){
            System.out.println("Letter Grade is: D+");
        }else if(score >= 67.5){
            System.out.println("Letter Grade is: D");
        }else if(score >= 64.5){
            System.out.println("Letter Grade is: D-");
        }else if(score >= 0){
            System.out.println("Letter Grade is: F");
        }


    }
}