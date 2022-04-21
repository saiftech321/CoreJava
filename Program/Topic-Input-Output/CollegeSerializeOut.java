package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CollegeSerializeOut {

	public static void main(String[] args) {
  
		
		try {
        
		Book c=new Book(2,"The Story Of Wild", "jamesGosh",34);
		Book c1=new Book(3,"The Story Of Games", "Gosh",337);
		Book c2=new Book(4,"The Warm Area","Samsen",65);
		
		List<Book> list=new ArrayList<Book>();
		
		list.add(c);
		list.add(c1);
		list.add(c2);
		
		FileOutputStream fis=new FileOutputStream("BookObject.ser");
		ObjectOutputStream obj=new ObjectOutputStream(fis);
		obj.writeObject(list);
		
		fis.close();
		obj.close();
		System.out.println("Book Object is Serailized");
		
		
		}
		catch(FileNotFoundException e) {}
		catch(IOException e){}
		
		
		catch(Exception e) {}
		
	}

}
