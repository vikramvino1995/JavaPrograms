package org.arrayPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicates {
	
	public static void main(String[] args) {
		

	int  a[] = {10,20,10,30,40,30,50,60,40};
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	
	for(Integer s : a) {
		
		set.add(s);
		
	}
	
	System.out.println("Duplicates Are Removed :"+set);
}

}