package org.arrayPrograms;

public class ArrayAscending {

	public static void main(String[] args) {
		
	int a[] = {30,2,100,60,80,12};		
	
	// 2,12,30,60,80,100
	
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			
			if(a[i]>a[j]) {
				
				int temp = a[i];
				
				a[i] = a[j]; 
				
				a[j]= temp; 
				
			}
			
		}
			
	}
	
	System.out.println("Ascending Order: ");
	
	for(int x : a ) {
		
		System.out.println(x);
	}
	
	}
}
