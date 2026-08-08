package model;

public class Account 
{
	private long accountNumber;
	private int customerId;
	private String accountType;
	private double balance;
	public Account()
	{
		
	}
	public Account(long accountNumber,int customerId,String accountType,double balance)
	{
		this.accountNumber=accountNumber;
		this.customerId=customerId;
		this.accountType=accountType;
		this.balance=balance;
	}
	
}
