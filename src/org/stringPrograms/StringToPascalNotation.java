package org.stringPrograms;

public class StringToPascalNotation {

	public static void main(String[] args) {
		
		String s = "welcome to java class";
		
		String value = "";
		
		String[] split = s.split(" ");
		
		for(String str : split) {
			
			char ch = str.charAt(0);
			
			String substring = str.substring(1);
			
			value = value + Character.toUpperCase(ch) + substring + " "; 
			
			//value = value + String.valueOf(ch).toUpperCase() + substring + " ";
			
			
		}
		
		System.out.println("Given String: "+s);
		
		System.out.println("Converted String: "+value);
		
	}
}

