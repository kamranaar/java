//Write a java program to find the Fibonacci series using user defined functions.
//

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.println(fibo(i));
        }
        // System.out.println("Fibonacci of "+num + "is "+ fibo(num));

        
    }
    public static int fibo(int n)
    {
        if( n==0 || n==1 )
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
