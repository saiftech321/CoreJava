package com.exception;

public class TimeCheckException {
        
	TimeCheckException()
	{
		for(int i=0;i<3;i++)
		{
		
			try 
			{
				int hh=28;
				int mm=66;
				int ss=55;
				if(hh>24 && hh<0) throw new HourException("This hour range is not between 0 to 24 ["+hh+"]");
				else if(mm>60 && mm<1) throw new MinutException("This minut not a range 1 to 60 ["+mm+"]");
				else if(ss>60 && ss<1) throw new SecondException(" This second is not range 1 to 60 ["+ss+"]");
			}
			catch(HourException e) {System.out.println("Invalid Hour" +e.getMessage());}
			catch(MinutException e) {System.out.println("Invalid Mimut " +e.getMessage());}
			catch(SecondException e) {System.out.println("Invalid Second" +e.getMessage());}
			System.out.println("hh:mm:ss  :  + is correct");
		}
		
	}
	
	public static void main(String[] args) {
		 new TimeCheckException();
	}
	
	
      class TimeException extends Exception
        
      {
    	  private static final long serialVersionUID=1L;
    	  public TimeException() {super();}
    	  public TimeException(String s) {super(s);}
      }
    class HourException extends TimeException
     {
    	 private static final long serialVersionUID=1L;
   	  public HourException() {super();}
   	  public HourException(String s) {super(s);}
     }
    class MinutException extends TimeException
    {
   	 private static final long serialVersionUID=1L;
  	  public MinutException() {super();}
  	  public MinutException(String s) {super(s);}
  	  
    }
    class SecondException extends TimeException
    {
   	 private static final long serialVersionUID=1L;
  	  public SecondException() {super();}
  	  public SecondException(String s) {super(s);}
    }
    
}