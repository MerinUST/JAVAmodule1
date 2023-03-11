package oopsday3.atm.menu;
import java.util.Scanner;

import NegativeAmountException.NegativeAmountException;
import oopsday3.atm.exceptions.InsufficientFundsException;


public class BankMenu {
		BankOfAmerica2 boa = new BankOfAmerica2();
		public BankMenu() {
			// TODO Auto-generated constructor stub
			Account a1 =new Account(101,"John Doe","Savings",500);
			Account a2 =new Account(102,"Jone Doe","Savings",700); 
			Account a3 =new Account(103,"Jason Doe","Salary",850);
			Account a4 =new Account(104,"Jane Doe","Salary",250);
			Account a5 =new Account(105,"Jons Doe","pension",650);
			
		
			boa.addAccount(a1);
			boa.addAccount(a2);
			boa.addAccount(a3);
			boa.addAccount(a4);
			boa.addAccount(a5);
			
		}
		public void menu() throws NegativeAmountException {
			Scanner scanner=new Scanner(System.in);
			int choice=0;
			loop:do {

				//System.out.println("enter your choice: 1..5");
				System.out.println("1.Display account");
				System.out.println("2.Deposit ");
				System.out.println("3.withdraw");
				System.out.println("4.balance enquire");
				System.out.println("exit");
				choice=scanner.nextInt();
				
				switch(choice) {
				case 1:{
					System.out.println("enter account number");
					int actno = scanner.nextInt();
					boa.detail(actno);
					
					
					System.out.println();
					break;
				}
				case 2:{ 
					System.out.println("enter account number:");
					int actno = scanner.nextInt();
					System.out.println("enter amount to deposit:");
					int amount = scanner.nextInt();
					double balance = boa.deposit(amount, actno);
					System.out.println(balance);
					break;
					
				}
				case 3:{
					System.out.println("enter account number:");
					int actno = scanner.nextInt();
					System.out.println("enter amount to deposit:");
					int amount = scanner.nextInt();
					double balance=0;
					try {
						balance = boa.withdraw(amount, actno);
					} catch (InsufficientFundsException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(balance);
					break;
				}
				case 4:{
					System.out.println("enter account number:");
					int actno = scanner.nextInt();
					double res=boa.balanceEnquiry(actno);
					System.out.println(res);
					
					break;
				}
				case 5:{
					
					break loop;
				}
				}
			}while(choice!=5);
		
		}
}
		
		
		
		
		