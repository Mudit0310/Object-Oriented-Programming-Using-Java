import java.util.Scanner;

public class GradeCalculator {
	
	public static char Calculator(int per)
	{
		char grade;
		if(per > 90)
			grade = 'A';
		else if(per >= 80 && per < 90)
			grade = 'B';
		else if(per >= 60 && per < 80)
			grade = 'C';
		else if(per >= 40 && per < 60)
			grade = 'D';
		else
			grade = 'E';
		
		return grade;
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your percentage: ");
		int percent = s.nextInt();
		char z = Calculator(percent);
		System.out.println("Your grade is: " + z);
	}
}
