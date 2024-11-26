import java.util.Scanner;

public class Factorial {
	public static int Fact(int n) {
		int i = 1;
		int res = 1;
		while(i<=n)
		{
			res *= i;
			i++;
		}
		
		return res;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		if(num < 0)
			System.out.println("Number is negative");
		else {
		int ans = Fact(num);
		System.out.println("Ans = " + ans);
		}
	}
}
