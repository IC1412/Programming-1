/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 6
*/

import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 1000: ");
        int answer = scan.nextInt();

        int tries = 0;
        while(true){
            tries ++;

            double think = Math.random() * 1001;
            int guess = (int)think;
            System.out.println("My guess was " + guess);
            if(guess == answer){
                System.out.println("I guessed the number was " + guess + " and it only took me " + tries + " guesses");
                break;
            }
        }
    }
}