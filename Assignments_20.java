package week_2;

import java.util.Scanner;
public class Assignments_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    Scanner scanner = new Scanner(System.in);

		        // Input: Number of elements
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        // Create an array
		        int[] numbers = new int[n];

		        // Input: Array elements
		        System.out.println("Enter " + n + " numbers:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        scanner.close();

		        // Calculate average
		        double average = calculateAverage(numbers, n);
		        System.out.println("The average is: " + average);
		    }

		    public static double calculateAverage(int[] arr, int size) {
		        int sum = 0;
		        for (int num : arr) {
		            sum += num;
		        }
		        return (double) sum / size; // Convert to double for decimal precision
		}

}
