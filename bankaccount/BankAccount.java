package bankaccount;

public class BankAccount {
	private int id;
	private String accountHolderName;
	private double balance;

	public BankAccount(int id, String accountHolderName) {
		this.id = id;
		this.accountHolderName = accountHolderName;
	}

	public BankAccount(int id, String accountHolderName, double balance) {
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getID() {
		return id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public boolean withdraw(double amount) {
		if (balance < amount) {
			return false;
		}
		balance = balance - amount;
		return true;
	}

}
