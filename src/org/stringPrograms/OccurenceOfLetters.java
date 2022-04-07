package org.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfLetters {

	public static void main(String[] args) {
		
		String s = "Goodday";
		
		// o = 2, d= 2, a=1, y=1, g =1
		
		char[] ch = s.toCharArray();
		
		Map<Character,Integer> m = new LinkedHashMap<>(); 
		
		for(char c : ch) {
			
			if(m.containsKey(c)) {
				
				Integer i = m.get(c);
				
				m.put(c,i+1);
				
			}
			
			else {
				m.put(c,1);
			}
			
		}
		
		System.out.println(m);
		
	}
}
