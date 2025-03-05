package week_2;
import java.util.Scanner;

public class Assignments_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter dividend: ");
		        int dividend = scanner.nextInt();
		        System.out.print("Enter divisor: ");
		        int divisor = scanner.nextInt();
		        scanner.close();

		        int remainder = dividend - (divisor * (dividend / divisor));

		        System.out.println("Remainder (mod): " + remainder);
		   

	}

}
