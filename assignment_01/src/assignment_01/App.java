package assignment_01;

import ignore.TestingUtils;

public class App {

	/**
	 * Given a string of odd length, return the middle 3 characters from the string,
	 * so the string <b>"Monitor"</b> yields <b>"nit"</b>. If the string length is
	 * less than 3, return the string as is. <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * middleThree("bunny") <b>---></b> "unn" <br>
	 * middleThree("peter") <b>---></b> "ete" <br>
	 * middleThree("Jamaica") <b>---></b>"mai" <br>
	 */

	public static String middleThree(String str) {

		// When the word middle came with any form, it makes sense. The logic could be
		// built with N/2....Here N is any kind of variable...
		String result = str;
		int takenLengthOfString = result.length();
		int takeStartingIndex = (takenLengthOfString / 2) - 1;
		int takeEndingIndex = takeStartingIndex + 3;
		if (result.length() % 2 != 0 && result.length() > 3) {

			String middleThreeChar = result.substring(takeStartingIndex, takeEndingIndex);
			System.out.println(middleThreeChar);
			return middleThreeChar;

		} else {
			return result;
		}

	}

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//

	public static void main(String args[]) {
		TestingUtils.runTests();

	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * String a = "hello"; String b = "hello     "; String name = "Borna"; // From
	 * which index it will start String subName = name.substring(0); // Starting and
	 * Ending position of String String subName1 = name.substring(0, 3);
	 * System.out.println(subName); System.out.println(subName1);
	 * 
	 * System.out.println(a.length() + "" + b.length());
	 * 
	 * if (name.length() == 5) {
	 * 
	 * System.out.println("The length is" + name.length()); }
	 * 
	 * else if (name.length() > 5) {
	 * 
	 * System.out.println("Length is greater than:" + name.length()); }
	 * 
	 * else {
	 * 
	 * System.out.println("Length is less than 5"); }
	 * 
	 * }
	 */
}
