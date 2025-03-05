package week_2;
import java.util.Scanner;

public class Assignments_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        scanner.close();

		        System.out.println("Factorial of " + num + " is: " + factorial(num));
		    }

		    public static long factorial(int n) {
		        long fact = 1;
		        for (int i = 2; i <= n; i++) {
		            fact *= i;
		        }
		        return fact;
		    

	}

}
