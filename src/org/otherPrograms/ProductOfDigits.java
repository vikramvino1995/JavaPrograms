package org.otherPrograms;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		int digits = 222; 
		
		int rem = 0;
		
		int prod = 1;
		
		while (digits > 0) {
			
			rem = digits % 10;
			
			prod = prod * rem;
			
			digits = digits/10;
			
		}
		
		System.out.println("ProductOfDigits: "+prod);
		
	}
}
