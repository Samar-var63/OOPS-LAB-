import java.util.Scanner;

public class RunWayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed, acceleration;
        System.out.print("Enter  speed of plane : ");
        speed = sc.nextDouble();

        System.out.print("Enter Acceleration of plane : ");
        acceleration = sc.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
        System.out.print("Minimum runway :  " + length);

    }

}
