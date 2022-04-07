package org.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfWords {

	public static void main(String[] args) {
		
		String words = "Apple Orange Banana Banana Orange Pine Pine strawberry";
		
		String[] word = words.split(" ");
		
		Map<String,Integer> map = new LinkedHashMap<String, Integer>();
		
		for(String s : word) {
			
			if(map.containsKey(s)) {
				
				  Integer i = map.get(s);
				  
				  map.put(s,i+1);
				
			}
			
			else {
				
				map.put(s,1);
			}
			
		}
		
		System.out.println("Given Words: "+words);
		
		System.out.println("Occurence Of Words: "+ map);
		

	}
}
