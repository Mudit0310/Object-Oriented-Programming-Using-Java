import java.util.Scanner;

public class Palindrome {
	public static boolean Palin(String str)
	{
		int s = 0, e = str.length()-1;
		while(s<e)
		{
			if(str.charAt(s) != str.charAt(e)) 
			{
				return false;
			}
			s++;
			e--;
		}
		
		return true;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = s.nextLine();
		boolean ans = Palin(str);
		System.out.println(ans);
	}
}
