import java.util.Scanner;

public class CeltoFaren {
	public static int Conversion(int cel) {
		int faren = (9/5) * cel + 32;
		
		return faren;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in celsius:");
		int cel = s.nextInt();
		
		int ans = Conversion(cel);
		System.out.println("Temperature in Farenheit: " + ans);
	}
}
