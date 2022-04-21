package com.exception;

public class UserDefinedException {
	
	
	
	String ages[] ={"23","54","43","56","22","15","44","78","-5","99","43","XY","66","65","87","38"};
	 
	int age;
	
	public UserDefinedException()
	{
	 for(int i=0;i<ages.length;i++)
	 
	 {
	     try 
	      {
	    	age=Integer.parseInt(ages[i]);
	    	  
	    	doAgeCheck(age);
	    	System.out.println("age ["+age+"] is correct");
	    	 }
	     catch(NegativeAgeException e) {
				System.out.println(age + " is negative: "+e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println(ages[i] + " is wrong data: "+e.getMessage());
			} catch(TooYoungAgeException e) {
				System.out.println(age + " is too young: "+e.getMessage());
			} catch(TooOldAgeException  e) {
				System.out.println(age + " is too old: "+e.getMessage());
			}
	 }
	 
		
	}

	public void doAgeCheck(int age) throws NegativeAgeException,TooYoungAgeException ,TooOldAgeException  
	{
		
		if(age<0) throw new NegativeAgeException("The age is less than 0 ["+ages+"]"); 
    	else if(age<18)throw new TooYoungAgeException("The age is less than 18 ["+ages+"]");
    	else if(age<18)throw new TooOldAgeException("The age is greaterthan than 70 ["+ages+"]");
    	System.out.println("age ["+age+"] is correct");
	}
	
	

	
	

	public static void main(String[] args) {

		new UserDefinedException();
	}

}
