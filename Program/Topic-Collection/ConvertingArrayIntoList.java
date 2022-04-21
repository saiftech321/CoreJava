package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ConvertingArrayIntoList {
                   
	
	public  ConvertingArrayIntoList()
	{
     
		String[][] employee={ 
		
					{"Sekhar","SoftwareEng","TechMahindra"},
					{"Natwar","Manager","Sbi"},
					{"James","ProjectManager","Mphasis"},
					{"Ram","SystemAnalyst","Algonox"}
				
			};
		
		//Conversion Of Array to List
		
		List<List<String>> biglist=new ArrayList<List<String>>(); 
		List<String> onelist;
		String[] oneEmployee;
		for(int i=0;i<employee.length;i++) 
		{
			onelist=new ArrayList<String>();
			oneEmployee=employee[i];
			for(String x:oneEmployee)
			{
				onelist.add(x);
			}
			biglist.add(onelist);
		}
		
		//Printing the list 
		for(List<String> l1:biglist) 
		{
			for(String s:l1) 
			{
				System.out.print(s+"-> ");
		
		
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		 new ConvertingArrayIntoList();


	}

}
