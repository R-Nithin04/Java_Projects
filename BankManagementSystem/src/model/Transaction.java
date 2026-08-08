package model;

public class Transaction 
{
	private int transactionid;
	private long accountnumber;
	private String transactiontype;
	private double amount;
	private String transactiondate;
	public Transaction()
	{
		
	}
	public Transaction(int transactionid,long accountnumber,String transactiontype,double amount,String transactiondate)
	{
		this.transactionid=transactionid;
		this.accountnumber=accountnumber;
		this.transactiontype=transactiontype;
		this.amount=amount;
		this.transactiondate=transactiondate;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactiondate() {
		return transactiondate;
	}
	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}
	
}
