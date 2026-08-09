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
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
