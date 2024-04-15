package oop;
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
