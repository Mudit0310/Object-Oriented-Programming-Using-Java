import java.util.Scanner;

public class Maximum {
	
	public static int maxi(int num1, int num2, int num3)
	{
		int res = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num3) ? num2 : num3;
		
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = s.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = s.nextInt();
		
		System.out.println("Enter third number: ");
		int num3 = s.nextInt();
		
		int ans = maxi(num1, num2, num3);
		System.out.println("Maximum -> " + ans);
	}
}
