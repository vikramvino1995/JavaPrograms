package org.otherPrograms;

public class FactorialNumber {

	public static void main(String[] args) {

		// 5 = 5 *4*3*2*1

		int prod = 1;

		for (int i = 1; i <= 6; i++) {

			prod = prod * i;

		}

		System.out.println("Factorial NUmber: " + prod);

	}
}
