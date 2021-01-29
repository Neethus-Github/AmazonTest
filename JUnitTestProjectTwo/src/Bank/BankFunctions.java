package Bank;

import java.util.Scanner;

public class BankFunctions {
	static String name,branch;
	static int accNo,balance,amt,principalAmt,tenure;
	static double rate,si,totalAmt,mPay,qPay,yPay;
	int minBal=1000;
	Scanner sc=new Scanner(System.in);
	public void accountDetails() {
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Account Number:");
		accNo=sc.nextInt();
		System.out.println("Enter Branch:");
		branch=sc.next();
		System.out.println("Enter Balance:");
		balance=sc.nextInt();
		
	}
	public void display() {
		System.out.println("Name "+name+"\nAccount Number "+accNo+"\nBranch"+branch+"Balance "+balance);
	}
	public void readWithdrawAmount() {
		System.out.println("Enter the amount to be withdrawn:");
		amt=sc.nextInt();
	}
	public String withdraw() {
		
		if(amt<=(balance-minBal)) {
			System.out.println("Withdrawal Successful");
			balance=balance-amt;
			System.out.println("Balance :"+balance);
			return Integer.toString(balance);
		}
		else {
			System.out.println("Insufficient Balance");
			String s="Insufficient Balance";
			return s;
		}
		
	}
	public void loan() {
		System.out.println("Enter Principal Amount:");
		principalAmt=sc.nextInt();
		System.out.println("Enter Rate of interest");
		rate=sc.nextDouble();
		System.out.println("Enter tenure:");
		tenure=sc.nextInt();
	}
	public double loanCalc() {
		si=(principalAmt*tenure*rate)/100;
		totalAmt=principalAmt+si;
		return totalAmt;
	}
	public double checkLoan(int ch) {
		
		if(ch==1) {
			mPay=totalAmt/12;
			return mPay;
		}
		else if(ch==2) {
			qPay=totalAmt/3;
			return qPay;
		}
		else {
			yPay=totalAmt/tenure;
			return yPay;
		}
	}
}
