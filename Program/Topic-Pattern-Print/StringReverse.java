package com.programs;

public class StringReverse {

	 public static void main(String []args){
         String s="Shafeek";
          String rev="";
       
     
      for(int i=(s.length())-1; i>=0; i--) {

       rev=rev+s.charAt(i);
                                    }
     System.out.println("Revere of the string: " + rev); 
     
	 }

}
