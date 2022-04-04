package org.stringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String str = "Hello Hello Vignesh why chennai why kerala come to DUBAI"; 
		
		String[] split = str.split(" ");
		
		String value = ""; 
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String s : split) {
			
			set.add(s);
			
		}
		
		System.out.println(set);
		
		
		for(String s1 : set) {
			
			value = value + s1 + " ";
			
		}
		
		System.out.println("Removed Duplicates : "+value);
		
		
	}
}
