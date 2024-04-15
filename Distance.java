import java.util.Scanner;

public class Distance {
    float _inch;
    float _feet;
    void set_distance(float inch, float feet)
    {
        _inch = inch;
        _feet = feet;
    }
    
    void get_diatance()
    {
        Scanner sc = new Scanner(System.in);
        _feet= sc.nextFloat();
        _inch= sc.nextFloat();

    }
    void show_distance()
    {
        System.out.println(_inch);
        System.out.println(_feet);
    }
}
