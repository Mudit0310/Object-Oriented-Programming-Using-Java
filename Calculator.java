import java.util.Scanner;

public class Calculator {
	public static int cal(int x, char oper, int y)
	{
		int res = 0;
		if(oper == '+')
			res = x + y;
		else if(oper == '-')
			res = x - y;
		else if(oper == '*')
			res = x * y;
		else if(oper == '/')
			res = x/y;
		else
			System.out.println("Invalid operator");
			
		return res;
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = s.nextInt();
		
		System.out.println("Enter an operator: ");
		char op = s.next().charAt(0);
		
		System.out.println("Enter second number: ");
		int b = s.nextInt();
		
		int ans = cal(a,op,b);
		
		System.out.println("Answer = " + ans);
	}
}
