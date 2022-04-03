package org.otherPrograms;

public class CountOfDigits {

	public static void main(String[] args) {
		
		int digits = 9999;
		
		int count = 0;
		
		while(digits>0) {
			
			digits = digits/10;
			
			count++;
			
		}
		
		System.out.println("Count OF Digits: "+count);
		
	}
}
