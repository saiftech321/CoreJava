package com.io;

import java.io.Serializable;

public class Passbook implements Serializable {
	
	
	int account_no;
	String account_name;
	String  bank_name;
	String  ifs_code;
	public Passbook() 
	{
		
	}
	
public Passbook(int account_no,String account_name,String  Bank_name,String  ifs_code) {
	
	this.account_no=account_no;
	this.account_name=account_name;
	this. bank_name= bank_name;
	this.ifs_code=ifs_code;
}
	
		
		
	

}
