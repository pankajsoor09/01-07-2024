package com.javaLoop;

public class Example4 
{

	public static void main(String[] args) 
	{

		int number = 5;
		
		int i = 1 , end = 10 ;
		
		System.out.println(i <= end);
		
		while(i <= end)
		{
			System.out.println(number+"x"+i+" = "+i*number);
		    i++;
		}	
		
	}

}
