package com.icici.loans.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args)
	{
		Hdfc h=new Hdfc();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void withdrawl()
	{
		System.out.println("im overriden withdrawl from HDFC");
	}

	@Override
	public void deposit()
	{
		System.out.println("im overriden deposit from HDFC");
	}

}
