package oop;

public class first{
    public static void main(String[] args) {
        System.out.println("Hello Kamran");
        User u = new User();
        //set name
        u.set_name("Kamran");


        //u.name = "Dhruv";  //this can not be used to acess the private 


        //get name here
        System.out.println(u.get_name());
    }
    
    
}
