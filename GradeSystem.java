import java.util.Scanner;
class Grade{
	String name;
	int roll_number;
	int total_marks;
	int average;
	void setName(String a)
	{
		name = a;
	}
	
	void setRollNumber(int r)
	{
		roll_number = r;
	}
	
	void getDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		setName(s.next());
		System.out.print("Enter your roll number: ");
		setRollNumber(s.nextInt());
		System.out.print("Enter the number of subject: ");
		int n = s.nextInt();
		System.out.println("Enter subject marks(out of 40): ");
		for(int i =0;i<n;i++)
		{
			System.out.print("Subject "+ (i + 1) + ": ");
			total_marks += s.nextInt();
			
		}
		average = total_marks/n;
	}
	
	void grades() {
		if(average >= 33)
		{
			System.out.println("Grade: A");;
		}
		else if(average >= 25 && average < 33)
		{
			System.out.println("Grade: B");
		}
		else if(average >= 18 && average < 25)
		{
			System.out.println("Grade: C");
		}
		else if(average >= 10 && average < 18)
		{
			System.out.println("Grade: D");
		}
		else {
			System.err.println("Fail");
		}
	}
	
	void displayDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + roll_number);
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Average marks: " + average);
	}
}
public class GradeSystem {
	public static void main(String[] args)
	{
		Grade g =new Grade();
		System.out.println("Enter your details - ");
		g.getDetails();
		g.displayDetails();
		g.grades();
	}
	
}
