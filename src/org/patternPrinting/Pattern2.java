package org.patternPrinting;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=6; i++) {
			
			for(int k=6-i;k>0; k--) {
				
				System.out.print(" ");
			}
			
			for(int j=0;j<i; j++) {
				
				System.out.print(" * ");
			}
			
		   System.out.println();
		}
		
	}
}
