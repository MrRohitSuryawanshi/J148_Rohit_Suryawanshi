package week_3;
import java.util.Arrays;

public class Assignments_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		   String str = "hello";
		        
		        char[] charArray = str.toCharArray(); // Convert string to char array
		        Arrays.sort(charArray); // Sort the char array
		        
		        String sortedStr = new String(charArray); // Convert back to string
		        
		        System.out.println("Sorted String: " + sortedStr);
		}

}
