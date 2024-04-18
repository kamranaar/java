/***A user will enter a user name and password, if user name and password are correct a
welcome message will display other maximum 3 attempts are allowed to enter
password, after 3 attempts program will terminate automatically.
***/
import java.util.*;
public class ques10 {
    public static void main(String[] args) {
        String _username = "Username";
        String _password = "kiet";
        boolean k= true;
        int count =3;
        while (k) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the username ");
            String username = sc.nextLine();
            System.out.println("Enter the Password ");
            String password = sc.nextLine();
            
            
            if(_username.equals(username) && _password.equals(password))
            {
                System.out.println("Login Sucessful Welcome!!");
                k=false;

            }
            else
            {
                count--;
                System.out.println("Invalid credentials Try again");
                System.out.println("You have "+ count+" attempts left");
            }
            if(count==0)
            {
                k=false;
            }

        }


    }
}
