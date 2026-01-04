/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 5
*/

import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int main = scan.nextInt();
        int remain = main % 2;

        switch (remain) {
            case 0:
                System.out.println("This number is divisible by 2");
                break;
            case 1:
                remain = main % 3;
                if (remain == 0) {
                    System.out.println("This number is divisible by 3");
                    break;
                } else {
                    remain = main % 5;
                    if (remain == 0) {
                        System.out.println("This number is divisible by 5");
                        break;
                    } else {
                        System.out.println("This number is undetermined");
                        break;
                    }
                }
            }
        }
    }

