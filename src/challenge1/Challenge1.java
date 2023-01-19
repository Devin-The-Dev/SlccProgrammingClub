package challenge1;

/**
 * SLCC Programming Club - Coding Challenge 1
 * September 21, 2022
 * 
 * This week's coding challenge focuses on manipulating arrays and
 * Strings. Implement the methods below using the instructions 
 * provided in the Doc Comments. Test your code using the Test Client.
 * 
 * OPTIONAL: For an added challenge, work through the logic of each
 * method with a team by writing your code on a white board without
 * the help of your computers. Once you're confident, code it and see
 * how you did!
 * 
 * @author Coding Bat + your_name
 */
public class Challenge1 {
	
	/**
	 * CHALLENGE 1a -- CodingBat Category: String1 
	 * 
	 * Determines if a given string ends with "ly".
	 * 
	 * EXAMPLES:
	 * endsLy("lovely")	  → true
	 * endsLy("ordinary") → false
	 * 
	 * @param str given string to search for "ly" at the end
	 * @return whether or not str ends with "ly"
	 */
	public static boolean endsLy(String str) {
		if (str.endsWith("ly")) {
			return true;
		} else {
			return false;  //TODO
		}
		
	}
	
	/**
	 * CHALLENGE 1b -- CodingBat Category: Array2
	 * 
	 * Given start and end numbers, return a new array containing 
	 * the sequence of integers from start up to but not including 
	 * end, so start = 5 and end = 10 yields {5, 6, 7, 8, 9}. The 
	 * end number will be greater or equal to the start number. 
	 * Empty arrays are valid.
	 * 
	 * EXAMPLES:
	 * fizzArray3(5, 10)  → [5, 6, 7, 8, 9]
	 * fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
	 * fizzArray3(1, 3)   → [1, 2]
	 * 
	 * @param start first integer
	 * @param end last integer
	 * @return the sequence of integers
	 */
	public static int[] fizzArray3(int start, int end) {
		
		int[] newArr;
		
		if(start == end) {
			newArr = new int[1];
			newArr[0] = start;
			return newArr;
		} else {
			newArr = new int[end - start];
			
			for (int i = 0; i < newArr.length; i++) {
				newArr[i] = start;
				start++;
			}
			return newArr; //TODO
		}
		
	}
	
	/**
	 * Ultimate Challenge -- CodingBat Category: String3
	 * 
	 * Given a string, return the sum of the digits 0-9 that appear 
	 * in the string, ignoring all other characters. Return 0 if there 
	 * are no digits in the string.
	 * 
	 * Hint: Character.isDigit(char) tests if a char is one of the 
	 * chars '0','1', ... '9'. Integer.parseInt(string) converts a string 
	 * to an int.
	 * 
	 * EXAMPLES:
	 * sumDigits("aa1bc2d3")  → 6
	 * sumDigits("aa11b33")   → 8
	 * sumDigits("Chocolate") → 0
	 * 
	 * @param str the string to search for integers
	 * @return the sum of all integers present in given string
	 */
	public static int sumDigits(String str) {
//		Remove all letters (and 0) from string
		str = str.replaceAll("([A-Z, a-z, 0])", "");
		
//		Measuring string length
		if (str.length() == 0) { //No numbers exist
			return 0;
		} else {
			
			int num = Integer.parseInt(str);
			int sum = 0;
			
			while(num > 0) {
				sum += num % 10;
				num /= 10; //eliminates the right most digit
			}
			
			return sum; //TODO
		}
		
	}

	
	
// = = = = = = = = TEST CLIENT = = = = = = = = =
	public static void main(String[] args) {
		//TODO Test your methods here.
		System.out.println("Ends in 'ly'");
		System.out.println("=================");
		System.out.println("lovely ending in -ly: " + endsLy("lovely"));
		System.out.println("ordinary ending in -ly: " + endsLy("ordinary"));
		System.out.println();
		
		System.out.println("fizzArray3");
		System.out.println("=================");
		
		showFizzArray3(fizzArray3(5, 10));
		showFizzArray3(fizzArray3(11, 18));
		showFizzArray3(fizzArray3(1, 3));
		
		System.out.println();
		System.out.println("CodingBat Category: String3");
		System.out.println("==================================");
		System.out.println(sumDigits("aa1bc2d3"));
		System.out.println(sumDigits("aa11b33"));
		System.out.println(sumDigits("Chocolate"));
		
	}
	
	public static void showFizzArray3(int[] storage) {
		for (int i = 0; i < storage.length; i++) {
			if (i != storage.length - 1) {
				System.out.print(storage[i] + ", ");
			} else {
				System.out.println(storage[i]);
			}
			
		}
	}

}
