//Write a Java program that prints all real and imaginary solutions to the quadratic
//equation ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula. 

import java.util.*;
public class ques3 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the coefficients of the Equation in order as x^2 and the x ");
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
    
            //d=(b^2-(4ac))
            double d = ((b*b)-(4*a*c));
            if(d>=0)
            {
                if(d==0)
                {
                    double r= (-b)/(2*a);
                    System.out.println("Roots are equal and equals to "+ r);
                    //roots are equal
                }
                // distinct roots
                System.out.println("Root Exists");
                double r1= (-b+ Math.sqrt(d))/(2*a);
                double r2= (-b- Math.sqrt(d))/(2*a);
                System.out.println("Root are" + r1 );
                System.out.println("Root are" + r2 );
    
    
            }
            else
            {
                //imaginary roots
                System.out.println("Roots does not exists ");
                //System.out.println("Im roots are ");
            }
        }
    }

