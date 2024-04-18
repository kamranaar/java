import java.util.Scanner;

public class Distance {
    float _inch;
    float _feet;
    Distance(float inch,float feet){
        _inch=inch;
        _feet=feet;
    }
    void set_distance(float inch, float feet)
    {
        _inch = inch;
        _feet = feet;
    }
    
    void get_diatance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feet ");
        _feet= sc.nextFloat();
        System.out.println("Enter inch ");
        _inch= sc.nextFloat();

    }
    void show_distance()
    {
        System.out.println(_inch +" "+ _feet);
        //System.out.println(_feet);
    }
    void add(Distance d1, Distance d2)
    {
        _feet = d1._feet+d2._feet;
        _inch = d1._inch + d2._inch;
    }
}
