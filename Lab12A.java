/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 12
*/
import java.util.Scanner;
class Chair{
    public int numOfLegs;
    public boolean rolling;
    public String material;

    public Chair(int legs, boolean roll, String mat)
    {
        numOfLegs = legs;
        rolling = roll;
        material = mat;
    }
}
public class Lab12A {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("you are about to create a chair.");
        System.out.println("How many legs does your chair have:");
        int legs = scan.nextInt();
        System.out.println("Is your chair rolling (true/false):");
        boolean roll = scan.nextBoolean();
        System.out.println("What is your chair made of:");
        String mat = scan.next();

        Chair c = new Chair(legs, roll, mat);
        if(c.rolling){
            System.out.println("Your chair has "+legs+" legs, is rolling, and is made of "+mat+".");
        }else{
            System.out.println("Your chair has "+legs+" legs, is not rolling, and is made of "+mat+".");
        }
        System.out.println("This program is going to change that.");

        c.numOfLegs = 4;
        c.rolling = false;
        c.material = "wood";
        System.out.println("Your chair has " + c.numOfLegs + " legs, is not rolling, and is made of " + c.material + ".");
    }
}
