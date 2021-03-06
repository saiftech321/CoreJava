package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

// Serialization
public class PassbookSerializeOut {

	public static void main(String[] args) {
		try {
			Passbook pb1 = new Passbook(10530351, "Programing", "State Bank of India", "SBIN00261");
			Passbook pb2 = new Passbook(10545875, "Mohit", "Bank Of Maharashtra", "BOMN04497");
			Passbook pb3 = new Passbook(10530351, "Davil", "State Bank of India", "SBIN00261");
			Passbook pb4 = new Passbook(10530351, "CodingPart", "State Bank of India", "SBIN00261");
			
			List<Passbook> list = new ArrayList<Passbook>();
			list.add(pb1);
			list.add(pb2);
			list.add(pb3);
			list.add(pb4);
			
			FileOutputStream fos = new FileOutputStream("PassbookObject.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(list);

			oos.close();
			fos.close();
			System.out.println("Passbook object is serialized");
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
		}
	}

}
