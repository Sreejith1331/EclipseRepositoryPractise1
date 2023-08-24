package oops;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objBA = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String customerName = objBA.next();
		System.out.println("Choose your bank\n1-SBI");
		int bankNo=0;
		switch(bankNo) {
		case 1:
			SBI objSbi1 = new SBI();
			objSbi1.accountDetails(customerName);
	
		}
	}

}

interface IBankDetails{
	void accountDetails(String name);
	void withdrawAmount();
	void depositAmount();
}

class SBI implements IBankDetails{
	Scanner objSbi = new Scanner(System.in);
	BankApplication objBA1 = new BankApplication();
	int accountNo;
	int balanceAmount = 10000;
	
		// TODO Auto-generated method stub
	
	@Override
	public void accountDetails(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bank Name: SBI");
		System.out.println("Account Holder Name: "+ name);
		System.out.println("Account Number: "+ accountNo);
		System.out.println("Balance Ammount: "+ balanceAmount);
	}

	@Override
	public void withdrawAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to withdraw: ");
		int withdraw = objSbi.nextInt();
		
		if(withdraw>balanceAmount)
			System.out.println("Insufficient balance to withdraw this amount!!!");
		else
			System.out.println("Balance Amount: "+ (balanceAmount-withdraw));
	}

	@Override
	public void depositAmount() {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to deposit: ");
		int deposite = objSbi.nextInt();
		System.out.println("Balance Amount: "+ (balanceAmount+deposite));
	}
	
}


