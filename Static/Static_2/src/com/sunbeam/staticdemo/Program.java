package com.sunbeam.staticdemo;

import java.util.Random;

class Employee
{
	private String name;
	private int empid;
	private float salary;
	private static int count;
	
	static
	{
		Random random = new Random();
		Employee.count = random.nextInt(100);
	}
	public Employee()
	{
		this("",0);
	}
	public Employee(String name, float salary)
	{
		this.name = name;
		this.empid = ++ Employee.count;
		this.salary = salary;
	}	
	@Override
	public String toString()
	{
		return String.format("%-20s%-5d%-7.2f", this.name, this.empid, this.salary);
	}
}
public class Program
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Sandeep", 15000.50f);
		System.out.println(emp1.toString());
		
		Employee emp2 = new Employee("Mukesh", 25000.50f);
		System.out.println(emp2.toString());
		
		Employee emp3 = new Employee("Sachin", 20000.50f);
		System.out.println(emp3.toString());
	}
}
