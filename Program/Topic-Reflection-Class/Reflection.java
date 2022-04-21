package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	

		public Reflection () throws ClassNotFoundException
		{
			 Class o=Class.forName("java.io.File");
			 Field f[]=o.getDeclaredFields();
			 Constructor c[]=o.getDeclaredConstructors();
			 Method m[]=o.getDeclaredMethods();
		
			 if(f.length>0) 
			   {
				 System.out.println("FIELDS INSIDE THIS CLASS:");
				 System.out.println("***********************************");
				 for(int i=0;i<f.length;i++) 
				 {
					 System.out.println((i+1)+":"+f[i]);
				 }
		
			   }
			 
			 if(c.length>0) 
			   {
				 System.out.println("CONSTRUCTOR INSIDE THIS CLASS:");
				 System.out.println("***********************************");
				 for(int i=0;i<c.length;i++) 
				 {
					 System.out.println((i+1)+":"+c[i]);
				 }
			   }
			 
			 
			 if(m.length>0) 
			   {
				 System.out.println("METHODS INSIDE THIS CLASS:");
				 System.out.println("***********************************");
				 for(int i=0;i<m.length;i++) 
				 {
					 System.out.println((i+1)+":"+m[i]);
				 }
			   }
		}
		
			 public static void main(String[] args) throws ClassNotFoundException {
		      
				 new Reflection();
		}

			

}
