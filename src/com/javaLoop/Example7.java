package com.javaLoop;

public class Example7 
{

	public static void main(String[] args)
	{

		//array 
				int values[] = {34, 56, 21, -34, 25};
				
				System.out.println("-----------------break------------------");

				for(int i = 0; i < values.length; i++)
				{
					
					if(i == 2)
					{
						break;
					}
					System.out.println(values[i]);
				}
				
				System.out.println("-----------------continue------------------");
				
				for(int i = 0; i < values.length; i++)
				{
					
					if(i == 2)
					{
						continue;
					}
					
					System.out.println(values[i]);
				}



				
	}

}
