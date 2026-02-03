import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double weight, height;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  weight in pounds ");
        weight = sc.nextDouble();

        System.out.print("Enter height in inches : ");
        height = sc.nextDouble();

        weight = weight * 0.45359237;
        height = height * 0.0254;
        
        Double result = weight / (height * height);
        System.out.println("BMI OF THE PERSON IS : " + result);

    }
}
