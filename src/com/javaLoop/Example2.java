package com.javaLoop;

public class Example2 
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
		int studentAges[] = {23, 21, 34, 24, 56};
		
		System.out.println(studentAges.length);//5

		System.out.println("----------forward direction----------");

		for(int i = 0; i < studentAges.length; i++)
		{
			System.out.println(studentAges[i]);
		}
		System.out.println("----------backward direction----------");

		for(int i = studentAges.length-1; i>=0; i--)
		{
			System.out.println(studentAges[i]);
		}
		System.out.println("----------enhanced for----------");

		for(int stduentAge : studentAges)
		{
			System.out.println(stduentAge);
		}
		
	}

}
