import java.util.Scanner;

class Course{
	int courseID;
	String courseName;
	String instructorName;
	double fee;
	String[] studentName;
	int count;
	static double revenue;
	
	Course(int courseID, String courseName, String instructorName, double fee)
	{
		this.courseID = courseID;
		this.courseName = courseName;
		this.instructorName= instructorName;
		this.fee = fee;
		this.studentName = new String[3];
	}
	
	void operation()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Enroll");
		System.out.println("2.Withdraw");
		System.out.println("3.Exit");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println("Enter your name:");
				String name = sc.next();
				enrollStudent(name);
				break;
			case 2:
				System.out.println("Enter your name:");
				String name1 = sc.next();
				withdrawStudent(name1);
				break;
			case 3:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid number entered");
			
		}
	}
	
	void withdrawStudent(String name)
	{
		boolean found = false;
		for(int i=0;i<count;i++)
		{
			if(studentName[i].equals(name))
			{
				for(int j=i;j<count-1;j++)
				{
					studentName[j] = studentName[j+1];
				}
				studentName[count-1] = null;
				count--;
				found = true;
				System.out.println(name + " has been withdrawn");
				break;
			}
			
		}
		if(!found)
		{
			System.out.println("You are not enrolled");
		}
	}
	
	void enrollStudent(String name)
	{
		if(count < 3)
		{
			studentName[count]=name;
			count++;
			System.out.println("You are enrolled!");
			displayStudents();			
		}else {
			System.out.println("Course is full");
		}
	}
	
	void displayStudents()
	{
		System.out.println("Students Enrolled - ");
		for(int i =0;i<count;i++)
		{
			System.out.println(studentName[i]);
		
		}
		
	}
	
	void display()
	{
		System.out.println("Course ID -" + courseID);
		System.out.println("Course Name -" + courseName);
		System.out.println("Instructor Name -" + instructorName);
		System.out.println("Fee -" + fee);
	}
}
public class OnlineCourse{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Course[] c = new Course[3];
		c[0] = new Course(101, "DAC" , "nathan", 90000);
		c[1] = new Course(102, "DBDA" , "xyz", 75000);
		c[2] = new Course(103, "DITISS" , "abc", 80000);
		
		for(int i=0;i<c.length;i++)
		{
			c[i].display();
		}
		
		do {
			System.out.println("Enter the course ID you want to enroll:");
			int id = s.nextInt();
			for(int i=0;i<c.length;i++)
			{
				if(c[i].courseID == id)
				{
					c[i].operation();
					
				}
			}
		}while(true);
		
	
}}