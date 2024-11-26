import java.util.Scanner;
class Bank
{
	int account_number;
	String account_holder_name;
	float balance;
	
	void deposit(float amt)
	{
		balance += amt;
	}
	
	void withdraw(float amt)
	{
		balance -= amt;
	}
	
	void displayBalance()
	{
		System.out.println("Balance = " + balance);
	}
	
	void setAccount(int acc)
	{
		this.account_number = acc;
	}
	
	void setName(String name)
	{
		this.account_holder_name = name;
	}
	
	void setBalance(float bal)
	{
		this.balance = bal;
	}
	
	void getDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Account Number:");
		setAccount(s.nextInt());
		System.out.println("Enter Account Holder Number:");
		setName(s.next());
		System.out.println("Enter Balance");
		setBalance(s.nextFloat());
	}
	
	void operation()
	{
		Scanner sc = new Scanner(System.in);
		int op;
		do{
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Select your Operation");
			op = sc.nextInt();
			switch(op)
			{
				case 1:
					System.out.println("Enter Amount: ");
					float amt = sc.nextFloat();
					deposit(amt);
					break;
				case 2:
					System.out.println("Enter Amount: ");
					float amt1 = sc.nextFloat();
					withdraw(amt1);
					break;
				case 3:
					System.out.println("Balance = " + balance);
					break;
				case 4: 
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid Operation");
			}
		}while(op!=4);
			
	}
}
public class BankAccount {
	public static void main(String[] args)
	{
		Bank b = new Bank();
		System.out.println("Enter Bank Details - ");
		b.getDetails();
		System.out.println("Operatins to perform: ");
		b.operation();
		
	}
}
 
