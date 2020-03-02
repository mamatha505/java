package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract 
{

	public static void main(String[] args) 
	{
		ChildClass obj=new ChildClass();
		obj.m1();
		obj.m2();
	}
	public void m1()
	{
		System.out.println("im overridden  m1 method ChildClass ");
	}

	@Override
	public void m2()
	{
		
		System.out.println("im overriden m2 in ChildClass");
		
	}

}
