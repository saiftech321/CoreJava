package com.collections;

public class Cinema implements Comparable<Cinema> {
	
	
	private double id;
	private String name;
	private int year;

	
	public Cinema(double id,String name,int year)
			{
		this.name=name;
		this.year=year;
		this.id=id;
		
		
	}
	
	
	 

	public double getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	public int geYear() 
	{
		return year;
	}

	

	@Override
	public int compareTo(Cinema o) {
		// TODO Auto-generated method stub
		return (int) (this.year - o.year);
	}




	

}