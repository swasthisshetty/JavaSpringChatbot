package watsonassistant;

import java.util.List;


public class Transaction {
	
	private String deposit;
	private String withdraw;
	private String balance;
	private String date_time; 

	
	
public String getDeposit() {
		return deposit;
	}



	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}



	public String getWithdraw() {
		return withdraw;
	}



	public void setWithdraw(String withdraw) {
		this.withdraw = withdraw;
	}



	public String getBalance() {
		return balance;
	}



	public void setBalance(String balance) {
		this.balance = balance;
	}



	public String getDate_time() {
		return date_time;
	}



	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}






	public Transaction(List<Account> accounts, String deposit, String withdraw, String balance, String date_time) {
		super();
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
		this.date_time = date_time;
		
	}



public Transaction() {
	// TODO Auto-generated constructor stub
}
}
	
	
