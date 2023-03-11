package oopsday2.atm;
import java.util.Arrays;


public  class BankOfAmerica2 implements BankingIface2 {

	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BankOfAmerica2 [accounts=" + Arrays.toString(accounts) + "]";
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void seAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public BankOfAmerica2(Account[] accounts) {
		this.accounts = accounts;
	}

	
	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed");

	}

	public Account transactionAccount(Account account) {
		return account;
	}

	@Override
	public double withdraw(double amount, int acctno) {
		double tempBal = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double deposit(double amount, int acctno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == acctno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
		
			}
			
		}
		return tempBal;
	}

	@Override
	public double balanceEnquiry(int actno) {
		double tempBal = 0;


		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
		
	}

}return tempBal;
}}