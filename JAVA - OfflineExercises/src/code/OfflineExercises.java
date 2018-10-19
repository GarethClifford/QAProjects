package code;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		int originalLength = input.length();
		char input1[] = input.toCharArray();
		ArrayList<Character> input2 = new ArrayList<>();
		// for (int i = 0; i < originalLength; i++) {
		// input2.add(input1[i]);
		// input2.add(input1[i]);
		// input2.add(input1[i]);
		// }
		// This for loop is exactly the same, the one below is just easier
		for (char i : input1) {
			input2.add(i);
			input2.add(i);
			input2.add(i);
		}
		String output = "";
		for (char letters : input2) {
			output += letters;
		}

		return output;
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "elivc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		if (input.length() > 8) {
			int start = input.toLowerCase().indexOf("bert") + 4;
			int end = input.toLowerCase().lastIndexOf("bert");

			String newstring = input.substring(start, end);
			String output = new StringBuilder(newstring).reverse().toString();
			return output;
		} else
			return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		if (a < b && a < c) {
			if (b - a == c - b) {
				return true;
			} else
				return false;
		} else if (a > b && a < c) {
			if (a - b == c - a) {
				return true;
			} else
				return false;
		} else if (a < c && b > c) {
			if (c - a == b - c) {
				return true;
			} else
				return false;
		} else if (a < b && c < a) {
			if (a - c == b - a) {
				return true;
			} else
				return false;
		} else if (b < c && c < a) {
			if (c - b == a - c) {
				return true;
			} else
				return false;
		} else if (a < b && b < a) {
			if (b - c == a - b) {
				return true;
			} else
				return false;
		}
		return false;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String output = "";
		for (int i = 0 ; )
		
		
		
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("cooldev") → true
	// endsDev("jh") → false
	// endsDev("coolev") → false

	public boolean endsDev(String input) {
		return false;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		return 0;

	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		return null;

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		return 0;

	}

}
