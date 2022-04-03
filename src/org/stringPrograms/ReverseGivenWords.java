package org.stringPrograms;

public class ReverseGivenWords {

	public static void main(String[] args) {

		String str = "Where are you";
		
		String rev = "";

		String[] str1 = str.split(" ");
		
		for(int i=str1.length-1;i>=0;i--) {
			
			rev = rev +" "+ str1[i];
			
		}
		
		System.out.println("Reversed Words: "+ rev);
		
	}
}
