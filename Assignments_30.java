package week_3;

import java.util.HashMap;
public class Assignments_30 {

	public static int firstUniqueChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : s.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with count 1
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i; // Return index of first unique character
            }
        }

        return -1; // If no unique character found
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		    String input = "loveleetcode";
		        int index = firstUniqueChar(input);
		        System.out.println("First unique character index: " + index);
		  
	}

}
