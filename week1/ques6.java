//Write a Java program to calculate a Factorial of a number
//

import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {

        System.out.println("Enter the number to find its factorial ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The factorial of "+ num + " "+ fact(num));
    }
    public static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
