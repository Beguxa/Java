package com.sunbeam.staticdemo;
class Singleton
{
	private int number;
	private Singleton( int number )
	{
		this.number = number;
	}
	static Singleton singleton = null;
	public static Singleton getInstance( int number )
	{
		if( singleton == null )
			singleton = new Singleton(number);
		return singleton; 
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
}
public class Program
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance(10);
		s1.setNumber(150 );
		System.out.println("Number	:	"+s1.getNumber());
	}
}
