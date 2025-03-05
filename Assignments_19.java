package week_2;
import java.util.Scanner;

public class Assignments_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter marks out of 100: ");
		        int marks = scanner.nextInt();
		        scanner.close();

		        int gradeCategory = marks / 10; // Convert marks to grade range

		        switch (gradeCategory) {
		            case 10:
		            case 9:
		                System.out.println("Grade: A");
		                break;
		            case 8:
		                System.out.println("Grade: B");
		                break;
		            case 7:
		                System.out.println("Grade: C");
		                break;
		            case 6:
		                System.out.println("Grade: D");
		                break;
		            case 5:
		                System.out.println("Grade: E");
		                break;
		            default:
		                System.out.println("Grade: F (Fail)");
		        }
		   
	}

}
