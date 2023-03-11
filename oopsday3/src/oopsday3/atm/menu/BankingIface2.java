package oopsday3.atm.menu;

import NegativeAmountException.NegativeAmountException;
import oopsday3.atm.exceptions.InsufficientFundsException;

public interface BankingIface2 {
	public abstract double withdraw(double amount,int acctno) throws InsufficientFundsException;
	public abstract double deposit(double amount, int acctno) throws NegativeAmountException;
	public abstract double balanceEnquiry(int actno);

}
