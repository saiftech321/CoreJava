package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		
		ArrayList<Cinema> list=new ArrayList<Cinema>();
		
		list.add(new Cinema(2.4,"safeek",2004));
		list.add(new Cinema(8.5,"saf",2009));
		list.add(new Cinema(4.5,"javen",2001));
		list.add(new Cinema(6.2,"saiftech",2023));
		
		System.out.println(" BEFORE SORTING THE ELEMENT");
		
		for(Cinema o:list)
		{
System.out.println(o.getId()+"  "+o.getName()+"  "+o.geYear());
	}
	
		Collections.sort(list);
		System.out.println();
		System.out.println("AFTER SORTING ELEMEMT");
		
		/*for(Cinema o:list)
		{
			System.out.println(o.getId()+"  "+o.getName()+"  "+o.geYear());
		}*/
		//When we are using padRight method after that output will come in cloumn wise...
		
		for(Cinema o:list)
		{
			System.out.println(padRight(String.valueOf(o.getId()),5)+"  "+padRight(o.getName(),25)+"  "+o.getId());
		}

}

	private static String padRight(String data, int length) {
         StringBuffer buf=new StringBuffer(data);
         for(int i=buf.length();i<length;i++)
		return buf.toString();
		return data;
	}
}