/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 5
*/

import java.util.Scanner;

public class Lab5C {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter x: ");
      int xline = scan.nextInt();
      System.out.println("Enter y: ");
      int yline = scan.nextInt();

      if(xline == 0 && yline == 0){
          System.out.println("This point is the origin.");
      }
      if(xline != 0 && yline == 0){
          System.out.println("This point is on the x axis.");
      }
      if(xline == 0 && yline != 0){
          System.out.println("This point is on the y axis.");
      }
      if(xline > 0 && yline > 0){
          System.out.println("This point is in the first quadrant.");
      } else if (xline < 0 && yline > 0) {
          System.out.println("This point is in the second quadrant.");
      } else if (xline < 0 && yline < 0) {
          System.out.println("This point is in the third quadrant.");
      } else if (xline > 0 && yline < 0) {
          System.out.println("This point is in the fourth quadrant.");
      }
    }
}