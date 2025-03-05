package week_2;
import java.util.Scanner;

public class Assignments_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        scanner.close();

		        if (isPrime(num)) {
		            System.out.println(num + " is a prime number.");
		        } else {
		            System.out.println(num + " is not a prime number.");
		        }
		    }

		    public static boolean isPrime(int n) {
		        if (n < 2) return false;  // 0 and 1 are not prime
		        if (n == 2 || n == 3) return true;  // 2 and 3 are prime numbers
		        if (n % 2 == 0) return false;  // Even numbers greater than 2 are not prime
		        
		        for (int i = 3; i * i <= n; i += 2) { // Checking divisibility up to √n
		            if (n % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    
	}

}
