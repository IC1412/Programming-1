/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 6
*/

import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome!");
      System.out.println("You have $1000 in your account.");
      int account = 1000;
      char y;

      do {
          System.out.println("Menu");
          System.out.println("0 - Make a deposit");
          System.out.println("1 - Make a withdrawal");
          System.out.println("2 - Display account value");
          System.out.println("Please make a selection: ");
          int choice = scan.nextInt();

          switch(choice) {
              case 0:
                  System.out.println("How much would you like to deposit? : ");
                  int deposit = scan.nextInt();
                  account += deposit;
                  System.out.println("Your current balance is $" + account);
                  break;

              case 1:
                  System.out.println("How much would you like to withdraw? :");
                  int withdraw = scan.nextInt();
                  account -= withdraw;
                  System.out.println("Your current balance is $" + account);
                  break;

              case 2:
                  System.out.println("Your current balance is $" + account);
                  break;

              default:
                  System.out.println("Invalid entry, please try again.");
                  break;

          }
          System.out.println("Would you like to return to the main menu (Y/N)? :");
          y = scan.next().charAt(0);

      } while (y == 'Y' || y == 'y');

      System.out.println("Thank you for banking with us!");
    }
}