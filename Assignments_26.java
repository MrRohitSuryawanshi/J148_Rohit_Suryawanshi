package week_3;

public class Assignments_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr = {10, 5, 20, 8, 25, 20};

		        int highest = Integer.MIN_VALUE;
		        int secondHighest = Integer.MIN_VALUE;

		        for (int num : arr) {
		            if (num > highest) { 
		                secondHighest = highest;
		                highest = num;
		            } else if (num > secondHighest && num != highest) { 
		                secondHighest = num;
		            }
		        }

		        System.out.println("Highest: " + highest);
		        System.out.println("Second Highest: " + secondHighest);
	}

}
