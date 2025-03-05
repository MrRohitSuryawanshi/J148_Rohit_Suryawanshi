package week_3;
import java.util.Scanner;

public class Assignments_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    Scanner scanner = new Scanner(System.in);
		        
		        // Get matrix size
		        System.out.print("Enter number of rows: ");
		        int rows = scanner.nextInt();
		        System.out.print("Enter number of columns: ");
		        int cols = scanner.nextInt();
		        
		        int[][] matrix1 = new int[rows][cols];
		        int[][] matrix2 = new int[rows][cols];
		        int[][] sumMatrix = new int[rows][cols];

		        // Input first matrix
		        System.out.println("Enter elements of first matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                matrix1[i][j] = scanner.nextInt();
		            }
		        }

		        // Input second matrix
		        System.out.println("Enter elements of second matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                matrix2[i][j] = scanner.nextInt();
		            }
		        }

		        // Add matrices
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        // Print the sum matrix
		        System.out.println("Sum of matrices:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(sumMatrix[i][j] + " ");
		            }
		            System.out.println();
		        }

		        scanner.close();
	}

}
