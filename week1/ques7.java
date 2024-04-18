//Take two numbers as input, check whether second number is existing in first number
//or not.

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);

        if(s2.contains(s1))
        {
            System.out.println("Yes Second String contains first String ");
        }
        else{
            System.out.println("Second String does't contain first String ");
        }
    
    }
    
}
