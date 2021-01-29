package Bank;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void test() {
		BankFunctions b=new BankFunctions();
		String s,expectedResult;
		b.accountDetails();
		b.readWithdrawAmount();
		if(b.amt<=(b.balance-b.minBal)) {
			//System.out.println("Withdrawal Successful");
			int wamt=b.balance-b.amt;
			
			expectedResult=Integer.toString(wamt);
		}
		else
			 expectedResult="Insufficient Balance";
		String actualResult=b.withdraw();
		assertEquals(expectedResult,actualResult);
		
	}
	
	
	@Test
	public void testTwo() {
		BankFunctions b=new BankFunctions();
		double si,delta=0.0;
		b.loan();
		si=(b.principalAmt*b.tenure*b.rate)/100;
		double totalAmt=b.principalAmt+si;
		double actualAmt=b.loanCalc();
		assertEquals(totalAmt,actualAmt,delta);
	}
	@Test
	public void testThree() {
		BankFunctions f=new BankFunctions();
		double mPay=f.totalAmt/12,delta=0.0;
		double actual=f.checkLoan(1);
		assertEquals(mPay,actual,delta);
	}
}
