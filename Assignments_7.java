import java.util.Scanner;

public class Assignments_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Scanner scanner = new Scanner(System.in);

		        // Taking character input from user
		        System.out.print("Enter a character: ");
		        char ch = scanner.next().charAt(0);

		        // Get ASCII value
		        int ascii = (int) ch;

		        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

		        scanner.close();
		    }
		

}
