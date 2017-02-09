package com.sunbeam.strings;

public class Program 
{
	public static void main(String[] args)
	{
		String str1 = "SunBeam";
		String str2 = "Sun"+"Beam";
		//at compile time it is treated as String str2 = "SunBeam";
		if( str1.equals(str2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		//Output	:	Equal	
	}
}
