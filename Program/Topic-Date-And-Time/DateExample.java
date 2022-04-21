package com.dateandtimeclass;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		
     // Time today=new Time(0);
      Date today=new Date();
    
       System.out.println(today);
       SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy(HH:mm a)");
       System.out.println(dateformat.format(today));
       
       /*LocalDate ld=new   LocalDate.now();
       System.out.println(ld);
       LocalTime lt=new LocalTime.now();
       System.out.println(lt);*/
	}

}
