package org.otherPrograms;

public class ArmstrongNumber {
	
	// 153 -> 1*3+5*3+3*3 = 153

	public static void main(String[] args) {
		
		int num = 123; 
		int rem = 0;
		int value = 0;
		
		int n=num;
		
		while(num > 0) {
			
			rem = num%10;
			value = value +(rem*rem*rem);
			num = num/10;
			
		}
		
		if(n==value) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
		
	}
}
