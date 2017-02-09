package com.sunbeam.array;

import java.util.Scanner;

public class Program
{
	public static void print_1( int[] arr)
	{
		int index = 0;
		do
		{
			System.out.print(arr[ index ]+"	");
			++ index;
		}while( index < arr.length );
		System.out.println();
	}
	public static void print_2( int[] arr)
	{
		int index = 0;
		while( index < arr.length )
		{
			System.out.print(arr[ index ]+"	");
			++ index;
		}
		System.out.println();
	}
	public static void print_3( int[] arr)
	{
		for( int index = 0; index < arr.length; ++ index )
			System.out.print(arr[index]+"	");
		System.out.println();
	}
	public static void print_4( int[] arr)
	{
		for (int value : arr)
			System.out.print(value+"	");
		System.out.println();
	}
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.do-while");
		System.out.println("2.while");
		System.out.println("3.for");
		System.out.println("4.foreach");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		int choice;
		int[] arr = new int[]{ 10, 20, 30 };
		while( ( choice = Program.menuList( ) ) != 0 )
		{
			switch( choice )
			{
				case 1:
					Program.print_1(arr);
					break;
				case 2:
					Program.print_2(arr);
					break;
				case 3:
					Program.print_3(arr);
					break;
				case 4:
					Program.print_4(arr);
					break;
			}
		}
	}
}
