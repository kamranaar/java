import java.util.*;

public class feet {
    public static void main(String[] args) {

        Distance d1= new Distance(2,3); // this is constructor
        Distance d2= new Distance(3,4);// this is not a constructor
        Distance d3 = new Distance(4,3);
        Counter c1 = new Counter();

        d1.set_distance(1, 5);
        d2.get_diatance();
        d3.add(d1, d2);

        d1.show_distance();
        d2.show_distance();
        d3.show_distance();

        
        c1.incr();
        System.out.println(c1.count);
      
        
    
    }
}
//create a program to enter feet and inches use method set distance(feet and inches are fixed) , get distance(it will take feet and inches from user) 
//show distance
