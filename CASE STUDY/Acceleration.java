import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        double v0, v1, t, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting velocity (m/s): ");
        v0 = sc.nextDouble();

        System.out.print("Enter ending velocity (m/s): ");
        v1 = sc.nextDouble();

        System.out.print("Enter time taken (seconds): ");
        t = sc.nextDouble();

        a = (v1 - v0) / t;

        System.out.println("Average acceleration = " + a + " m/s^2");

        sc.close();
    }
}