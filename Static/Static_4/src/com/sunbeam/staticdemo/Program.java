package com.sunbeam.staticdemo;
class Test
{
	public static void show()
	{
		System.out.println("Inside Test.show");
	}
}
public class Program
{
	public static void print()
	{
		System.out.println("Inside Program.print");
	}
	public static void main(String[] args)
	{
		print();	//allowed
		
		Program.print();//allowed
		
		//show();	//Not allowed
		
		Test.show();//
	}
}
