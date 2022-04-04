package org.stringPrograms;

import java.lang.reflect.Array;

public class StringToCamelNotation {

	public static void main(String[] args) {
		
		String str = "JavaStringPrograms";
		
		String value = "";
		
		char ch = str.charAt(0);
		
		String substring = str.substring(1);
		
		value = value + Character.toLowerCase(ch) + substring; 
	
		System.out.println(value);
		
	}
}
