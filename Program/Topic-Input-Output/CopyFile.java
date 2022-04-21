package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*   Write a program to copy file name into another name .
 * 		To create another duplicate file.
 * 		Such as Create file nameis=textfile.text
 */

public class CopyFile {
	public String sourceFile = "textfile.txt";
	public String destinationFile = "Copytextfile.txt";

	public CopyFile() {
		try {
			InputStream in = new FileInputStream(sourceFile);
			OutputStream out = new FileOutputStream(destinationFile);
			
			int i = 0;
			while( (i=in.read()) != -1 ) {
				out.write(i);
			}
			
			out.close();
			in.close();
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		} catch(Exception e) {
		}
	}
	
	public static void main(String[] args) {
		new CopyFile();
	}

}