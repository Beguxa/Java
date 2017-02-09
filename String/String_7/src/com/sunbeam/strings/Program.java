package com.sunbeam.strings;

public class Program 
{
	public static void main(String[] args)
	{
		String str = "Sun";
		String str1 =  ( str + "Beam" ).intern();
		String str2 = "SunBeam";
		if( str1 == str2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		//Output	:	Equal	
	}
}
