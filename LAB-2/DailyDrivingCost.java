import java.util.Scanner;

class DailyDrivingCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double milesPerDay;
        double milesPerGallon;
        double costPerGallon;
        double parkingFees;
        double tollCharges;
        double fuelCost;
        double totalCost;

        System.out.print("Enter total miles driven per day: ");
        milesPerDay = sc.nextDouble();

        System.out.print("Enter miles per gallon: ");
        milesPerGallon = sc.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        costPerGallon = sc.nextDouble();

        System.out.print("Enter average parking fees per day: ");
        parkingFees = sc.nextDouble();

        System.out.print("Enter toll charges per day: ");
        tollCharges = sc.nextDouble();

        fuelCost = (milesPerDay / milesPerGallon) * costPerGallon;
        totalCost = fuelCost + parkingFees + tollCharges;

        System.out.println("\nDaily Driving Cost = " + totalCost);
    }
}
