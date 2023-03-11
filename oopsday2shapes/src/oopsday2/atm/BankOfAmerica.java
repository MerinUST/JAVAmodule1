package oopsday2.atm;

 public class BankOfAmerica implements BankingIface {
	private Account account =new Account(10010,"John Doe","salary",500);

	@Override
	public  double withdraw(double amount) {
		// TODO Auto-generated method stub
		account.setBalance(account.getBalance()-amount);
		return account.getBalance();
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		account.setBalance(account.getBalance()+amount);
		
		return account.getBalance();
	}

	@Override
	public double balanceEnquiry(int actno) {
		// TODO Auto-generated method stub
		
		
		
		return account.getBalance();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}