package com.javaLoop;

public class Example5 
{

	public static void main(String[] args) 
	{

int number = 5;
		
		int i = 1;
		int end = -10;
		
		System.out.println(i <= end);
		
		do
		{
			System.out.println(number+"x"+i+" = "+i*number);
			i++;
		}
		while(i <= end);
	}

}
