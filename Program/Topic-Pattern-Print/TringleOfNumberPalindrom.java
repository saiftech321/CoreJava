package com.programs;

public class TringleOfNumberPalindrom {

	public static void main(String[] args) {
    
		
		int n=9;
		
		for(int i=1;i<=n;i++) 
		
		
		{	
			
			for(int j=i;j<=n;j++) {
				
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) 
			{
				System.out.print(n+" ");
				
			}
			
			for(int j=1;j<=i;j++) 
			{
				
				System.out.print(" ");
			} 
			System.out.println();
		} 
		
		
		
	}

}
