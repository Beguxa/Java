package com.sunbeam.strings;

public class Program 
{
	public static void main(String[] args)
	{		
		String str1 =  "SunBeam";
		String str2 = new String("SunBeam");
		if( str1 == str2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		//Output	:	Not Equal	
	}
}
