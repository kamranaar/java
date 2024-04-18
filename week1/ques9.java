//Enter a string, increment, and toggle each character in the string.

import java.util.Scanner;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s3= "";
        for(int i=0;i<s1.length();i++)
        {
            char s2 = s1.charAt(i);
            
            s2++;
            if(isupper(s2))
            {
                s3 = s3+ Character.toLowerCase(s2);
            }
            else{
                s3= s3+ (Character.toUpperCase(s2));
            }

        }
        System.out.println("The updated String is "+ s3);
        sc.close();
       
        
    }

    public static boolean isupper(char s)
    {
        if(Character.isUpperCase(s))
        {
            return true;
        }
        return false;
    }
}
