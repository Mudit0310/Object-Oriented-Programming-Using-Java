import java.util.Scanner;
public class CharCount {
	public static int charCount(String str, char c) {
		int count = 0;
		int i =0;
		while(i<=str.length()-1)
		{
			if(str.charAt(i) == c)
			{
				count++;
			}
			
			i++;
		}
		
		return count;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = s.nextLine();
		System.out.println("Enter a Character:");
		char c = s.next().charAt(0);
		
		int res = charCount(str, c);
		System.out.println("Number of Occurence: " + res);
		
	}

}
