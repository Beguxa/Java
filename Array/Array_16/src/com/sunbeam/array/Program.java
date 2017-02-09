package com.sunbeam.array;

class Complex
{
	private int real;
	private int imag;
	public Complex()
	{
		this(0,0);
	}
	public Complex( int real, int imag )
	{
		this.real = real;
		this.imag = imag;
	}
	@Override
	public String toString()
	{
		return String.format("%-5d%-5d", this.real, this.imag);
	}
}
public class Program
{		
	public static void printPrimitives()
	{
		boolean[] arr = new boolean[3];
		for (boolean value : arr)
			System.out.print(value+"	");
		System.out.println();
	}
	public static void printNonPrimitives()
	{
		Complex[] arr = new Complex[ 3 ];
		for( int index = 0; index < arr.length; ++ index )
			arr[ index ] = new Complex(10,20);
	
		for (Complex c : arr)
			System.out.println(c.toString());
	}
	public static void main(String[] args)
	{
		Program.printPrimitives();
		Program.printNonPrimitives();
	}
}
