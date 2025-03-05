package week_3;
import java.util.Stack;

public class Assignments_29 {
	 public static String removeDuplicates(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char ch : s.toCharArray()) {
	            if (!stack.isEmpty() && stack.peek() == ch) {
	                stack.pop(); // Remove adjacent duplicate
	            } else {
	                stack.push(ch);
	            }
	        }

	        // Build the final string from the stack
	        StringBuilder result = new StringBuilder();
	        for (char ch : stack) {
	            result.append(ch);
	        }
	        
	        return result.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    String input = "abbaca";
		        System.out.println("Output: " + removeDuplicates(input));
		  
	}

}
