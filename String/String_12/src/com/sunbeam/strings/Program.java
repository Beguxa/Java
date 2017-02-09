package com.sunbeam.strings;

public class Program 
{
	public static void main(String[] args)
	{		
		String str = "SunBeam Infotech Pune";
		String regex = " ";
		String[] words = str.split(regex);
		for (String word : words)
		{
			System.out.println(word);
		}
	}
}
