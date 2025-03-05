package week_2;
import java.util.Scanner;

public class Assignments_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter marks out of 100: ");
		        int marks = scanner.nextInt();
		        scanner.close();

		        String grade = calculateGrade(marks);
		        System.out.println("Grade: " + grade);
		    }

		    public static String calculateGrade(int marks) {
		        if (marks >= 90 && marks <= 100) {
		            return "A";
		        } else if (marks >= 80) {
		            return "B";
		        } else if (marks >= 70) {
		            return "C";
		        } else if (marks >= 60) {
		            return "D";
		        } else if (marks >= 50) {
		            return "E";
		        } else {
		            return "F (Fail)";
		        }
		    

	}

}
