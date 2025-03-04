import java.util.Scanner;

public class Assignments_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Principal Amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate (r in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Number of Times Interest is Compounded per Year (n): ");
        int timesCompounded = scanner.nextInt();

        System.out.print("Enter Number of Years (t): ");
        double time = scanner.nextDouble();

        // Convert interest rate to decimal
        double rateDecimal = rate / 100;

        // Compound Interest formula
        double amount = principal * Math.pow((1 + rateDecimal / timesCompounded), (timesCompounded * time));
        double compoundInterest = amount - principal;

        // Output the results
        System.out.println("\nFinal Amount (A): " + String.format("%.2f", amount));
        System.out.println("Compound Interest: " + String.format("%.2f", compoundInterest));

        scanner.close();

	}

}
