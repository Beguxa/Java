package com.sunbeam.array;
public class Program
{
	public static void main(String[] args)
	{
		int[][] arr = new int[][]{ { 10, 20, 30 }, { 40, 50, 60 } };
		
		for( int i = 0; i < 2; ++ i )
		{
			for( int j = 0; j < 3; ++ j )
			{
				System.out.print(arr[ i ][ j ]+"	");				
			}
			System.out.println();
		}
	}
}
