package week_2;

import java.util.Scanner;
public class Assignments_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();
		        scanner.close();

		        if (isPalindrome(num)) {
		            System.out.println(num + " is a palindrome.");
		        } else {
		            System.out.println(num + " is not a palindrome.");
		        }
		    }

		    public static boolean isPalindrome(int n) {
		        int original = n;
		        int reversed = 0;

		        while (n > 0) {
		            int digit = n % 10;   // Extract last digit
		            reversed = reversed * 10 + digit; // Append digit to reversed number
		            n /= 10;  // Remove last digit
		        }

		        return original == reversed; // Check if reversed number matches original
		    }
		

}
