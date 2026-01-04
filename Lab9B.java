/*
Class: CSE 1321L
Section: J02
Term: Spring 2024
Instructor: Praveen Durvesla
Name: Ian Campbell
Lab#: 9
*/


import java.util.Scanner;
public class Lab9B {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[11];

        System.out.println("Please enter 11 numbers:");
        for(int i=0; i < 11; i++){
            System.out.print("Integer "+(i+1)+": ");
            array[i] = scan.nextInt();
        }

        System.out.print("What is the target number: ");
        int find = scan.nextInt();

        for(int i=0; i< array.length; i++){
            for(int j=0; j< array.length-i-1; j++)
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
            }
        }
        System.out.print("The sorted set is: ");
        for(int i=0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();
        int low =0;
        int mid =0;
        int high = array.length - 1;
        while(high >= low){
            mid=(low+high)/2;
            System.out.println("Low is "+low);
            System.out.println("High is "+high);
            System.out.println("Mid is "+mid);
            if(find < array[mid]){
                high = mid -1;
                System.out.println("Searching");
            }else if(find == array[mid]){
                System.out.print("The target is in the set.");
                break;
            }else{
                low = mid + 1;
                System.out.println("Searching");
            }
        }
        if(low > high){
            System.out.print("The target is not in the set.");
        }
    }
}
