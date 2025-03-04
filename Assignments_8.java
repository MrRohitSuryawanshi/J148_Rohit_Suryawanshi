
public class Assignments_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        System.out.println("Prime numbers between 1 and 100 are:");

		        for (int num = 2; num <= 100; num++) { 
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		            }
		        }
		    }

		    // Method to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n < 2) return false; // Numbers less than 2 are not prime

		        for (int i = 2; i <= Math.sqrt(n); i++) {
		            if (n % i == 0) {
		                return false; // If divisible, not a prime
		            }
		        }
		        return true; // Prime number
		    }

}
