package com.programs;

public class Figur_H {

	public static void main(String[] args) {
		
		int spaces=9;int n = 0;

		for(int i=9;i>=1;i--) 
		{
			
			for(int j=1;j<=spaces;j++) 
				
				System.out.print(j);
			
			for(int j=0;j<=n;j++)
				
				System.out.print(" ");
			
			for(int j=spaces;j>=1;j--)
			System.out.print(j);
            spaces--;n+=2;			
			System.out.println();
		
			
			
		}
		
		
		
		
	}

}
