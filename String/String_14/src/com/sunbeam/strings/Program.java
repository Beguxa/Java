package com.sunbeam.strings;

import java.util.StringTokenizer;

public class Program 
{
	public static void main(String[] args)
	{		
		String str = "SunBeam Infotech Pune";
		
		StringTokenizer tokenizer = new StringTokenizer(str);
		
		while( tokenizer.hasMoreElements( ) )
		{
			String token = ( String )tokenizer.nextElement();
			System.out.println(token);
		}
	} 
}
