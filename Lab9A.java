/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 9
*/

import java.util.Scanner;
public class Lab9A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        boolean isFound = false;

        System.out.println("Please enter 10 numbers:");
        for(int i=0; i < 10; i++){
            System.out.print("Integer "+(i+1)+": ");
            array[i] = scan.nextInt();
        }

        System.out.print("What is the target number: ");
        int find = scan.nextInt();

        for(int i=0; i<array.length; i++){
            if(array[i]== find){
                isFound = true;
            }
        }

        if(isFound){
            System.out.println("The target is in the set.");
        }else{
            System.out.println("The target is not in the set.");
        }
    }
}
