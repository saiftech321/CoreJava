package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.io.*;
import java.util.*;

public class BookSerializeIn {
	
	public static void main(String[] args) throws IOException
	{
		
		try {
		FileInputStream fis=new FileInputStream("BookObject.ser");
		ObjectInputStream oos=new ObjectInputStream(fis);
		
		List<Book> list = (List<Book>)oos.readObject();
	  Book c= list.get(0);
	  Book c1=list.get(1);
	  Book c2=list.get(2);
	  
	  
	  System.out.println("BOOK ID :"+c.book_id);
	  System.out.println("BOOK TITLE :"+c2.book_title);
	  System.out.println("BOOK PAGES :"+c.book_pages);
	  System.out.println("BOOK AUTHER :"+c1.book_auther);
	  System.out.println("BOOK TITLE :"+c.book_title);
	  System.out.println("BOOK ID :"+c2.book_id);
		
		
	  fis.close();
	  oos.close();
	  
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
