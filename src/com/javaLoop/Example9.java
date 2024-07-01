package com.javaLoop;

public class Example9 
{

	public static void main(String[] args) 
	{
		//nested for loop

		int values[][] = {{34,56,-23},{21,-34,25},{90,67,60}};//3*3 = 9
		
		for(int i = 0; i < values.length; i++)//outer loop for print row
		{
			for(int j = 0; j < values.length; j++)// inner loop to print column
			{
				System.out.println(values[i][j]);
			}
	}

}
}
