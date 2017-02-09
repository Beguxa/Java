package com.sunbeam.strings;

class StringTest
{
	public static String str1 = "SunBeam";
}
public class Program 
{
	public static String str2 = "SunBeam";
	public static void main(String[] args)
	{		
		if( StringTest.str1.equals( Program.str2 ) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		//Output	:	Equal	
	}
}
