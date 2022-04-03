package org.otherPrograms;

public class SumOfDigits {

	public static void main(String[] args) {

		int digits = 22222;

		int rem = 0;

		int sum = 0;

		while (digits > 0) {

			rem = digits % 10;

			sum = sum + rem;

			digits = digits / 10;

		}

		System.out.println("Sum of Digits: " + sum);

	}

}
