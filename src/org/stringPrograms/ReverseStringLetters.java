package org.stringPrograms;

public class ReverseStringLetters {

	public static void main(String[] args) {

		String str = "Java Selenium";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char value = str.charAt(i);

			rev = rev + value;
		}
		System.out.println("String Reverse for " + str + " : "+ rev);
	}
}


// Reversing Letter by Letter