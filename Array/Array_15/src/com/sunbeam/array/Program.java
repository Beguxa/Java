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
		Arrays.sort(arr);
		Program.print(arr);
		
		int key = 60;
		int index = Arrays.binarySearch(arr, key);
		System.out.printf("Key : %d is found at index : %d\n", key, index);
	}
}
