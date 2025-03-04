import java.util.Scanner;

public class Assignments_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter second number: ");
		        int num2 = scanner.nextInt();

		        // Swapping without third variable
		        num1 = num1 + num2;
		        num2 = num1 - num2;
		        num1 = num1 - num2;

		        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

		        scanner.close();
		    }

}
