package com.sunbeam.array;

import java.util.Scanner;

public class Program
{
	public static void print_1(int[][] arr)
	{
		int i = 0;
		do
		{
			int j = 0;
			do
			{			
				System.out.print(arr[ i ][ j ]+"	");
				++ j ;
			}while( j < arr[ i ].length );
			++ i ;
			System.out.println();
		}while( i  < arr.length );
	}
	public static void print_2( int[][] arr )
	{
		int i = 0;
		while( i  < arr.length )
		{
			int j = 0;
			while( j < arr[ i ].length )
			{			
				System.out.print(arr[ i ][ j ]+"	");
				++ j ;
			}
			++ i ;
			System.out.println();
		}
	}
	public static void print_3( int[][] arr )
	{
		for( int i = 0; i < arr.length; ++ i )
		{
			for( int  j = 0; j < arr[ i ].length; ++ j )
			{
				System.out.print(arr[i][j]+"	");
			}
			System.out.println();
		}
	}
	public static void print_4( int[][] arr )
	{
		for( int[] i : arr )
		{
			for( int j : i )
				System.out.print(j+"	");
			System.out.println();
		}
	}
	static Scanner sc = new Scanner(System.in);
	public static int menuList()
	{
		System.out.println("0.Exit");
		System.out.println("1.do-while");
		System.out.println("2.while");
		System.out.println("3.for");
		System.out.println("4.foreach");
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		int choice;
		int[][] arr = new int[3][];
		arr[ 0 ] = new int[]{ 10, 20 };
		arr[ 1 ] = new int[]{ 10, 20, 30 };
		arr[ 2 ] = new int[]{ 10, 20, 30, 40 };
		while( ( choice = Program.menuList())!=0)
		{
			switch(choice)
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
