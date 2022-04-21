package com.io;

import java.io.Serializable;

public class Book implements Serializable {
	
	int book_id;
	String book_title;
	String book_auther;
	int book_pages;
	
	
	
	
	
	public Book(int book_id,String book_title,String book_auther,int book_page)
	{
		this.book_id=book_id;
		this.book_title=book_title;
		this.book_auther=book_auther;
		this.book_pages=book_pages;
		
	}
	

}
