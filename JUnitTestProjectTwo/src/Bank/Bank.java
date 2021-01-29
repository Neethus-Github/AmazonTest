package Bank;

import java.util.Scanner;

public class Bank {
	public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			BankFunctions f=new BankFunctions();
			f.accountDetails();
			System.out.println("Account Details");
			f.display();
			f.readWithdrawAmount();
			f.withdraw();
			f.loan();
			double amt=f.loanCalc();
			System.out.println("Total Amount "+amt);
			System.out.println("1.Monthly\n2.Quarterly\n3.Yearly\nEnter your choice:");
			int ch=sc.nextInt();
			double amount=f.checkLoan(ch);
			System.out.println("Amount to be Paid "+amount);
			
			
	}
}
