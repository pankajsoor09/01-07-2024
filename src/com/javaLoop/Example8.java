package com.javaLoop;

public class Example8 
{

	public static void main(String[] args)
	{

		//array
		for(int i = 1; i <= 5; i++)//outer loop for print row
		{
			for(int j = 1; j<=5; j++)// inner loop to print column
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
