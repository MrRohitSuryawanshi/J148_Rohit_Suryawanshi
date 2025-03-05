package week_3;

import java.util.Scanner;
public class Assignments_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();

		        int count = String.valueOf(Math.abs(num)).length();

		        System.out.println("Number of digits: " + count);
		        scanner.close();
		  
	}

}
