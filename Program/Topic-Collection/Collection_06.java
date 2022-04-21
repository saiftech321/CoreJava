package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment_06 {

	public static void  main(String[] args) {

		
		ArrayList<String> ar=new ArrayList<String>();
		
		
		ar.add("10");
		ar.add("20");
		ar.add("30");
		ar.add("40");
		ar.add("50");
		ar.add("60");
		ar.add("70");
		ar.add("80");
		ar.add("90");
		ar.add("100");
		

		
		System.out.println("\r\n BEFORE SWAP THE ARRAYLIST");
		for(String s:ar) 
		{
			System.out.println(s);
		}
		
		System.out.println("##############################################");
		
		
	
		//Swap Item or element........
		System.out.println("\r\n AFTER SWAP THE ARRAYLIST");
		
		Collections.swap(ar,0,5);
		Collections.swap(ar,1,6);
		Collections.swap(ar,2,7);
		Collections.swap(ar,3,8);
		Collections.swap(ar,4,9);
		
		
			for(String s1:ar) 
			{
				System.out.println(s1);
			}   
}
	
}