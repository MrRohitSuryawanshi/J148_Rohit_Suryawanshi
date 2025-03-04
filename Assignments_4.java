import java.util.Scanner;

public class Assignments_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        // Taking input from user
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();

	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();

	        // Calculate area
	        double area = length * width;

	        System.out.println("The area of the rectangle is: " + area);

	        scanner.close();
	}

}
