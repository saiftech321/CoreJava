package com.exception;



public class Exceptios {

	public static void main(String[] args) {

		String s="java is a programinglanguage";
		
		String[] a = {"saif","ravi","kumar","json","apache","muted","regex","value"};
		int j=25;
		int m=0;
		for(int n=0;n<6;n++)
		 {
			try {
				System.out.println(j/m);
				
				
			}
				
				catch (ArithmeticException e )
				{
					System.out.println("Arithmetic Exception");
				}
				
				
			
			catch(Exception e) {System.out.println(e);}
			finally {System.out.println("Finally Exicuted");}

		 }
		System.out.println();
	}

}
