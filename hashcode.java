import java.util.*;
public class hashcode {
    public static void main(String[] args) {
        String s1="abcd";
        // String s2="abcd";
        // String s3=s1;
        // String s4="aaaa";
        // String s5 = new String("abcd");

        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        // System.out.println(s3.hashCode());
        // System.out.println(s4.hashCode());
        // System.out.println(s5.hashCode());


        //to char Array 
        //String s11 = "hello world";
        char[] ch = s1.toCharArray();
        System.out.println(ch);
        // System.out.println(Character.toUpperCase(s1));
        for(int i=0;i< ch.length;i++)
        {   
            char str1 = Character.toUpperCase(ch[i]);
            ch[i]= str1;
            //System.out.print(ch[i]);
            System.out.print(ch[i]);
        }
        Scanner sc = new Scanner(System.in);
        char str2 =sc.next().charAt(0);
        str2 = (char) (str2 +1);
        System.out.println(str2);

        String f = sc.nextLine();
        for(int i =0; i< f.length(); i++)
        {
            char current = f.charAt(i);
            if(Character.isLowerCase(current))
            {
                
            }
        }

        

    }
}
