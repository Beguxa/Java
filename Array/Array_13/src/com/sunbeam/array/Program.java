package com.sunbeam.array;

public class Program
{	
	public static int sum( int... arr)
	{
		int result = 0;
		for( int value : arr )
			result = result + value;
		return result;
	}
	public static void main(String[] args)
	{
		int result = sum( 10, 20, 30, 40, 50 );
		System.out.println("Result	:	"+result);
	}
}
