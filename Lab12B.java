/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 12
*/
import java.util.Scanner;
class Dog{
    public int age;
    public double weight;
    public String name;
    public String furColor;
    public String breed;
    public void bark(){
        System.out.println("Woof! Woof!");
    }
    public void rename(String newName){
        name = newName;
    }
    public void eat(double total){
        weight += total;
    }
}
public class Lab12B {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Dog D1 = new Dog();
        System.out.println("You are about to create a dog");
        System.out.println("How old is the dog:");
        D1.age = scan.nextInt();
        System.out.println("How much does the dog weigh:");
        D1.weight = scan.nextDouble();
        System.out.println("What is the dog's name:");
        D1.name = scan.next();
        System.out.println("What color is the dog:");
        D1.furColor = scan.next();
        System.out.println("What breed is the dog:");
        D1.breed = scan.next();
        System.out.println(D1.name+" is a "+D1.age+" year old "+D1.furColor+" "+D1.breed+" that weighs "+D1.weight+" lbs.");

        D1.bark();
        System.out.println(D1.name+" is hungry, how much should he eat:");
        double total = scan.nextDouble();
        D1.eat(total);
        System.out.println(D1.name+" isn't a very good name. What should they be renamed to:");
        String newName = scan.next();
        D1.rename(newName);
        System.out.println(D1.name+" is a "+D1.age+" year old "+D1.furColor+" "+D1.breed+" that weighs "+D1.weight+" lbs.");
    }
}
