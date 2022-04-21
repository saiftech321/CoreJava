package com.exception;

public class ElectionAgeCheck {

	

		String ages[] ={"23","54","43","56","22","15","44","78","-5","99","43","XY","66","65","87","38"};
		 
		int age;
		
		public ElectionAgeCheck()
		{
		 for(int i=0;i<ages.length;i++)
		 
		 {
		     try 
		      {
		    	age=Integer.parseInt(ages[i]);
		    	
		    	if(age<0) throw new NegativeAgeException("The age is less than 0 ["+ages[i]+"]"); 
		    	else if(age<18)throw new TooYoungAgeException("The age is less than 18 ["+ages[i]+"]");
		    	else if(age<18)throw new TooOldAgeException("The age is greaterthan than 70 ["+ages[i]+"]");
		    	System.out.println("age ["+age+"] is correct");
		    	 }
		     catch(NegativeAgeException e) {
					System.out.println(age + " is negative: "+e.getMessage());
				} catch(NumberFormatException e) {
					System.out.println(ages[i] + " is wrong data: "+e.getMessage());
				} catch(TooYoungAgeException e) {
					System.out.println(age + " is too young: "+e.getMessage());
				} catch(TooOldAgeException e) {
					System.out.println(age + " is too old: "+e.getMessage());
				}
		 }
		 
			
		}

		public static void main(String[] args)
		{
		  new ElectionAgeCheck();
		}
      }
		class AgeException extends Exception {
			private static final long serialVersionUID = 1L;
			public AgeException() {super();}
			public AgeException(String mes) {super(mes);}
		}

		class InvalidAgeException extends AgeException {
			private static final long serialVersionUID = 1L;
			public InvalidAgeException() {super();}
			public InvalidAgeException(String mes) {super(mes);}
		}

		class NegativeAgeException extends InvalidAgeException {
			private static final long serialVersionUID = 1L;
			public NegativeAgeException() {super();}
			public NegativeAgeException(String mes) {super(mes);}
		}

		class WrongDataInAgeException extends InvalidAgeException {
			private static final long serialVersionUID = 1L;
			public WrongDataInAgeException() {super();}
			public WrongDataInAgeException(String mes) {super(mes);}
		}

		class AgeLimitException extends AgeException {
			private static final long serialVersionUID = 1L;
			public AgeLimitException() {super();}
			public AgeLimitException(String mes) {super(mes);}
		}

		class TooOldAgeException extends AgeLimitException {
			private static final long serialVersionUID = 1L;
			public TooOldAgeException() {super();}
			public TooOldAgeException(String mes) {super(mes);}
		}

		class TooYoungAgeException extends AgeLimitException {
			private static final long serialVersionUID = 1L;
			public TooYoungAgeException() {super();}
			public TooYoungAgeException(String mes) {super(mes);}
		}

