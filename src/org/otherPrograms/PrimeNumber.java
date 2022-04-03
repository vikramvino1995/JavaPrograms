package org.otherPrograms;

import java.util.Scanner;

public class PrimeNumber {

	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		System.out.println("Please enter an number: ");
		
		int userInput = s.nextInt();
		
		int rem = 0;
		
		for(int i=2; i<= userInput/2; i++) {
			
			if(userInput%2 == 0 ) {
				rem  = 1;
			}	
		}
		
		if (rem ==0) {
			System.out.println("It is an prime number");
		}
		else {
			System.out.println("It is not an prime number");
		}
		
	}
}
