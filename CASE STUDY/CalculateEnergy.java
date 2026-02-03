import java.util.Scanner;

public class CalculateEnergy {
    public static void main(String[] args) {

        double t1, t2, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  initialTemperature (c)");
        t2 = sc.nextDouble();

        System.out.print("Enter finalTemperature (c) ");
        t1 = sc.nextDouble();

        System.out.print("Enter the weight of water in kilograms ");
        m = sc.nextDouble();

        double Energy = m * (t1 - t2) * 4184.0;
        System.out.print("Energy needed is : " + Energy);

        sc.close();

    }

}
