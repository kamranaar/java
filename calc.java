// package oop;
import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This is a program for a simple calculator in Java");
        System.out.println("Enter the first operand ");
        double a = sc.nextInt();

        System.out.println("Enter the operator ");
        char ch = sc.next().charAt(0);

        System.out.println("Enter the second operand ");
        double b = sc.nextInt();
        String s1="abcd";
        String s2="abcd";
        String s3=s1;
        String s4="aaaa";
        String s5 = new String("abcd");

        // int len = s1.length();
        for(int i=0;i<s1.length();i++)
        {   
            // char str1 = s1.next().charAt(i);
            System.out.println(s1.charAt(i));
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());




        switch (ch) {
            case '+':
            System.out.println(a+b);
                
                break;


            case '-':
            System.out.println(a-b);
                
                break;

            case '*':
            System.out.println(a*b);
                
                break;

            case '/':
            System.out.println(a/b);
                
                break;

            
        
            default:
                System.out.println("Not supported");
                break;
        }
        sc.close();


    }
    
}
