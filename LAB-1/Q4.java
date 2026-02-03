import java.util.*;
import java.math.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();

        int diameter=2*radius;
        double pi=Math.PI;
        double  circumference=2*pi*radius;
        double area=pi*radius*radius;

        System.out.println(radius);
        System.out.println(diameter);
        System.out.println(circumference);
        System.out.println(area);
    }
}
