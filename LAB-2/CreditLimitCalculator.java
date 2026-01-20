import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number (-1 to exit): ");
        int accountNumber = sc.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter balance at the beginning of the month: ");
            double balance = sc.nextDouble();

            System.out.print("Enter total charges this month: ");
            double charges = sc.nextDouble();

            System.out.print("Enter total credits applied: ");
            double totalCredits = sc.nextDouble();

            System.out.print("Enter allowed credit limit: ");
            double creditLimit = sc.nextDouble();

            double newBalance = balance + charges - totalCredits;

            System.out.println("\nAccount Number: " + accountNumber);
            System.out.println("New Balance: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded!");
            }

            System.out.print("\nEnter next account number (-1 to exit): ");
            accountNumber = sc.nextInt();
        }

    }
}
