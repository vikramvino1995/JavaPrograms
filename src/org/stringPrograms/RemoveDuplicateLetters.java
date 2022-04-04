package org.stringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetters {

	
	public static void main(String[] args) {
		
		String words = "Apple Banana"; 
		
		String value = "";
		
		Set<Character> s = new LinkedHashSet<>();
		
		for(int i=0;i<words.length();i++) {
			
			char ch = words.charAt(i);
			
			s.add(ch);
			
		}
		
		System.out.println(s);
		
		for(char c : s) {
			
			value = value + c ;
		}
		
		System.out.println("Removed Duplicates: "+value);
		
	}
}
