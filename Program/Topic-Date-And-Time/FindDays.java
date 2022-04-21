package com.dateandtimeclass;

import java.util.Date;
import java.text.SimpleDateFormat;

class FindDays {
	
	
     public static void main(String args[]) {
    	 
	 SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	 String dateBeforeString = "31 03 2022";
	 String dateAfterString = "03 04 2022";

	 try {
	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	      float daysBetween = (difference / (1000*60*60*24));
               
	       
	       System.out.println("Number of Days between dates: "+daysBetween);
	       
	 } catch (Exception e) {
	       e.printStackTrace();
    }
   }
}
