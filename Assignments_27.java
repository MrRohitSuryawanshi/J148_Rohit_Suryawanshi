package week_3;
import java.util.Arrays;

public class Assignments_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int[] arr1 = {1, 2, 3};
		        int[] arr2 = {4, 5, 6};

		        int[] result = new int[arr1.length + arr2.length];

		        System.arraycopy(arr1, 0, result, 0, arr1.length);
		        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

		        System.out.println("Concatenated Array: " + Arrays.toString(result));
		  
	}

}
