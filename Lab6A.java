/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 6
*/

import java.util.Scanner;

public class Lab6A {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter 10 numbers and this program will display the largest.");

      int high = 0;
      for (int i = 1; i <=10; i++){
          System.out.print("Please enter number " + i +":");
          int num = scan.nextInt();
          if(num >= high) {
              high = num;
          }
          if(i == 10){
              System.out.print("The largest number was " + high);
          }
      }
    }
}