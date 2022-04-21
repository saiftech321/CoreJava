package com.dateandtimeclass;

public class Clock {
	
	public Clock(int hh,int mm,int ss) 
	
	{
		if(hh>0 || hh<=24) 
		  {
			System.out.println("This is valid Hour");
		  }
		
		else 
		{
			System.out.println("This is invalid Hour");
		}
		if(mm<1 || mm>60) 
		  {
			System.out.println("This is invalid minut");
		  }
		
		else 
		{
			System.out.println("This is valid Minut");
		}
		
		if(ss<1 || ss>60) 
		  {
			System.out.println("This is invalid Second");
		  }
		else 
		{
			System.out.println("This is  valid Second");
		}
	}

	public static void main(String[] args) {
           
		new Clock(23,61,56);
	}

	
}
