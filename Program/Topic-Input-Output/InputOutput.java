package com.io;

import java.io.File;

public class InputOutput {

	public static void main(String[] args) {

		
	File file = new File("D:\\Java Program\\Learncode\\src\\com\\dateandtimeclass\\Clock.java");
		
		System.out.println(file.length());
		//System.out.println(file.delete());
		System.out.println(file.canRead());
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
        System.out.println();
		
	}

}
