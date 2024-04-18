//Enter a string and count no. of digits, alphabet and special character in the string.

import java.util.*;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int digits=0, alphabet=0,special =0;
        for(int i=0;i<=s.length();i++)
        {
            char s1 = s.charAt(i);
            if(Character.isAlphabetic(s1)){
                System.out.println(s1 +" Is letter ");
                alphabet++;
            }
            else if( Character.isDigit(s1))
            {
                System.out.println(s1 + " Is Digit");
                digits++;
            }
            else
            {
                System.out.println(s1 + " is Special Character");
                special++;
            }
            System.out.println("Digit is "+ digits + "Letter "+ alphabet+" "+ "Special Character "+special);
        }
        
    }
}
