package org.stringPrograms;

public class StringAscending {

	public static void main(String[] args) {
		
		String str = "Goodday";
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]>ch[j]) {
					
					char temp = ch[i];
					
					ch[i] = ch[j];
					
					ch[j] = temp;
					
				}
				
			}
			
		}
		
		System.out.println("Ascending Order: ");

		for(Character c : ch) {
			System.out.println(c);
		}
		
		int value[]= {ch[0],ch[1],ch[2],ch[3],ch[4],ch[5],ch[6]};
		
		for(int i=0;i<ch.length;i++) {
			
			value[i] = ch[i]; 
		}
	
		for(int i=0;i<value.length;i++) {
			
			System.out.println("ASCII value for "+ ch[i] +":"+ value[i] );
			
		}
		
	
	}
}

