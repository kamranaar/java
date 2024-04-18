//Write a Java program to demonstrate Scanner Class to take input from user and add tow
//number.

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one ");
        int a = sc.nextInt();

        System.out.println("Enter the number two ");
        int b = sc.nextInt();
        
        System.out.println("Sum is "+ (a+b));

    }
}