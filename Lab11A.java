/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 11
*/
import java.util.Scanner;
public class Lab11A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String cont = "yes";
        boolean game = true;
        do {
            System.out.println("Menu");
            System.out.println("0) Hello World");
            System.out.println("1) Goodbye Moon");
            System.out.println("2) Walking on Sunshine");
            System.out.println();
            System.out.println("What would you like to do: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 0: {
                    System.out.println("Hello");
                    break;
                }
                case 1: {
                    System.out.println("Ok, bye.");
                    break;
                }
                case 2: {
                    System.out.println("WHOA!");
                    break;
                }
            }
                System.out.println();
                System.out.println("Type YES to rerun. ");
                String player = scan.next();
                String check = player.toLowerCase();
                game = check.equals(cont);
        }while(game);
        System.out.print("Program Ends");
    }
}
