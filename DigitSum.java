import java.util.Scanner;

public class DigitSum {
	
	public static int Sum(int n)
	{
		int ans = 0;
		while(n>0)
		{
			ans += n%10;
			n = n/10;
		}
		
		return ans;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = s.nextInt();
		
		int res = Sum(n);
		System.out.println("Ans = " + res);
	}
}
