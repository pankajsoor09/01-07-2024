package com.javaLoop;

public class Example3
{

	public static void main(String[] args)
	{

		/**
		 * Write a java program to print students ages
		 * 
		 * int studentAges[] = {23, 21, 34, 24, 56};//5
		 * 
		 */
		
		//  0    1   2   3   4
		//array 
		int studentAges[] = {23, 21, 34, 24, 56, 56, 78};

		int count = 0;

		System.out.println("----------size of an array----------");

		for(int studentAge: studentAges)
		{
			count = count + 1;//count++
		}
		System.out.print(count);
	}

}
