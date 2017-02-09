package com.sunbeam.array;

import java.util.Arrays;

public class Program
{	
	public static void print( int[] arr )
	{
		for( int value : arr )
		{
			System.out.print(value+"	");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] arr = new int[]{ 50, 10, 40, 20, 30,90, 60, 80, 70 };
		Program.print(arr);
		Arrays.sort(arr);
		Program.print(arr);
	}
}
