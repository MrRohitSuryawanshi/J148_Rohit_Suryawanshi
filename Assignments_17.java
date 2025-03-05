package week_2;
import java.util.Scanner;

public class Assignments_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        scanner.close();

		        if (isArmstrong(num)) {
		            System.out.println(num + " is an Armstrong number.");
		        } else {
		            System.out.println(num + " is not an Armstrong number.");
		        }
		    }

		    public static boolean isArmstrong(int num) {
		        int originalNum = num;
		        int sum = 0;
		        int digits = String.valueOf(num).length(); // Step 1: Count digits

		        while (num > 0) {
		            int digit = num % 10; // Step 2: Extract last digit
		            sum += Math.pow(digit, digits); // Step 3: Raise to power and sum
		            num /= 10; // Step 4: Remove last digit
		        }

		        return sum == originalNum; // Step 5: Check if Armstrong
		   }

	}


