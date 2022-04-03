package org.otherPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		
		System.out.println("Please enter an number: ");

		int userInput = s.nextInt();

		int rem = 0;

		int rev = 0;

		int num = userInput;

		while (userInput > 0) {

			rem = userInput % 10;

			rev = (rev * 10) + rem;

			userInput = userInput / 10;

		}

		if (num == rev) {

			System.out.println("It is an palindrome number");
		} else {
			System.out.println("It is not an palindrome number");
		}

	}

}
