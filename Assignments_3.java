import java.util.Scanner;

public class Assignments_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        long result = 1;

        // Calculate power manually
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        scanner.close();
	}

}
