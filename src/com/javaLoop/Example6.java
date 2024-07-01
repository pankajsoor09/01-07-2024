package com.javaLoop;

public class Example6 
{

	public static void main(String[] args) 
	{

		/**
		 * Write a java program to validate the number is positive or negative,
		 * if it is positive validate that number is even or odd from the 
		 * given array of values.
		 * 
		 * int values[] = {34, 56, -23, 21, -34, 25, 90, 67, 60};
		 * 
		 */
		
		
		//array 
		int values[] = {34, 56, -23, 21, -34, 25, 90, 67, 60};

		for(int i = 0; i < values.length; i++)
		{
			if(values[i] > 0)
			{
				if(values[i]%2 == 0)
				{
					System.out.println(values[i]);
				}
			}
		}


	}

}
