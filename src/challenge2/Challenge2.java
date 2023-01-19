package challenge2;

/**
 * SLCC Programming Club - Coding Challenge 2
 * October 5, 2022
 * 
 * This week's coding challenges feature common interview questions that require recursion.
 * Implement the methods below based off of the instructions provided in the doc comments.
 * 
 * For an added challenge, try writing out your code before using your computer. Type it into
 * your computer only when you're ready to verify your code works!
 * 
 * @author ...
 *
 */
public class Challenge2 {
	/**
	 * Creates a new string by removing any instance of the character 'x' from a 
	 * provided String. 
	 * 
	 * Warm up by coding this iteratively or recursively.
	 * 
	 * EXAMPLES:
	 * warmUp("axbxcxd") → "abcd"
	 * warmUp("xxx a xxx") → " a " 
	 * 
	 * @param str string to modify
	 * @return string with x's removed
	 */
	public static String warmUp(String str) {
		String newStr = "";
		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (letter == 'x') {
				continue;
			} else {
				newStr += letter;
			}
		}
		return newStr; //TODO
	}

	/**
	 * Reverses a given string.
	 * 
	 * EXAMPLES:
	 * reverse("hello") → "olleh"
	 * reverse("extraordinary") → "yranidroartxe"
	 * 
	 * @param str string to reverse
	 * @return reversed string
	 */
	public static String reverse (String str) {
		String revStr = "";
		for (int i = 1; i <= str.length(); i++) {
			revStr = revStr +  str.charAt(str.length() - i);
		}
		return revStr; //TODO
	}
	
	/**
	 * Determines the sum of two given numbers without using any arithmetic operators.
	 * 
	 * EXAMPLES:
	 * sum(12,15) → 27
	 * sum(20, 3) → 23
	 * 
	 * @param first first number
	 * @param second second number
	 * @return sum of the two numbers
	 */
	public static int sum(int first, int second) {
			while (second != 0) {
				int carry = first & second;
				
				first = first ^ second;
				
				second = carry << 1;
			}
			
			return first; //TODO
	}
	
	/**
	 * ULTIMATE CHALLENGE:
	 * 
	 * Returns the longest substring present in the provided Strings. Empty Strings are
	 * valid.
	 * 
	 * EXAMPLES:
	 * longestSubstring("Fresh","Press") → "res"
	 * longestSubstring("solution","action") → "tion"
	 * 
	 * @param a first string
	 * @param b second string
	 * @return longest substring
	 */
	public String longestSubstring(String first, String second) {
		return ""; //TODO
	}
	
	/** ===================================================================================
	 *  TEST CLIENT
	 *  ===================================================================================
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("warmUp challenge:");
		System.out.println("axbxcxd -> " + warmUp("axbxcxd"));
		System.out.println("xxx a xxx -> " + warmUp("xxx a xxx"));
		System.out.println("===============");
		System.out.println("reverse challenge:");
		System.out.println("hello -> " + reverse("hello"));
		System.out.println("extraordinary -> " + reverse("extraordinary"));
		System.out.println("===============");
		System.out.println("sum w/o arithmetic operators");
		System.out.println("Sum of 12 and 15: " + sum(12,15));
		System.out.println("Sum of 23 and 5: " + sum(20,3));
	}

}