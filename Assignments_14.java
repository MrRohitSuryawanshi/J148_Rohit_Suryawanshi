package week_2;
import java.util.Scanner;

public class Assignments_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int n = scanner.nextInt();
		        scanner.close();

		        System.out.println("Fibonacci series up to " + n + ":");
		        printFibonacci(n);
		    }

		    public static void printFibonacci(int n) {
		        int a = 0, b = 1;

		        if (n >= 1) System.out.print(a + " ");
		        if (n >= 2) System.out.print(b + " ");

		        for (int i = 3; i <= n; i++) {
		            int next = a + b;
		            System.out.print(next + " ");
		            a = b;
		            b = next;
		        }
		   

	}

}
