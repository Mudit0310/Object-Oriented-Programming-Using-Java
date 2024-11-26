class BankAccount
{
	int accountNumber;
	float balance;
	
	BankAccount(int accountNumber, float balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}

class SavingsAccount extends BankAccount{
	float interestRate;
	
	SavingsAccount(int accountNumber, float balance, float interestRate)
	{
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	float calculateBalances()
	{
		return (balance + (balance*interestRate/100));
	}
	
}

class CheckingAccount extends BankAccount{
	int overdraftlimit;
	
	CheckingAccount(int accountNumber, float balance, int overdraftlimit)
	{
		super(accountNumber, balance);
		this.overdraftlimit = overdraftlimit;
	}
	
	float calculateBalances()
	{
		return balance+overdraftlimit;
	}
}


public class BankAccounts {
	public static void main(String[] args)
	{
		CheckingAccount ca = new CheckingAccount(1001, 50000, 25000);
		float amt = ca.calculateBalances();
		System.out.println("Balance of Checking Account = " + amt);
		
		SavingsAccount sa = new SavingsAccount(1002, 50000, 10);
		float amt1 = sa.calculateBalances();
		System.out.println("Balance of Savings Account = " + amt1);
	}
}
