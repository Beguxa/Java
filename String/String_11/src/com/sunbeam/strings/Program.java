package com.sunbeam.strings;

public class Program 
{
	public static void main(String[] args)
	{		
		String str = "SunBeam";
		if( str.isEmpty())
		{
			int length = str.length();
			System.out.println("Length	:	"+ length);		//7
			
			String strLower = str.toLowerCase();
			System.out.println("Lower	:	"+strLower);	//sunbeam
			
			String strUpper = str.toUpperCase();
			System.out.println("Upper	:	"+strUpper);	//SUNBEAM
		}
	}
}
