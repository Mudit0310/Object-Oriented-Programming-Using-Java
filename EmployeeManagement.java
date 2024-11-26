import java.util.Scanner;
class Employee
{
	int empid;
	String name;
	String designation;
	float salary;
	float inc_salary;
	Scanner s = new Scanner(System.in);
	void setEmpid(int id)
	{
		this.empid = id;
	}
	
	void setName(String na)
	{
		this.name = na;
	}
	
	void setDesignation(String desig)
	{
		this.designation = desig; 
	}
	
	void setSalary(float sal)
	{
		this.salary = sal; 
	}
	
	void getDetails()
	{
		System.out.print("Enter Employee ID: ");
		setEmpid(s.nextInt());
		System.out.print("Enter Name: ");
		setName(s.next());
		System.out.print("Enter Designation: ");
		setDesignation(s.next());
		System.out.print("Enter Salary: ");
		setSalary(s.nextFloat());
	}
	
	void salaryIncrease()
	{
		System.out.println("Increase salary by(in percent):");
		int inc = s.nextInt();
		inc_salary = salary + (salary*inc)/100;
	}
	
	void displayDetails()
	{
		System.out.println("Employee ID: " + empid);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Increased Salary: " + inc_salary);
		System.out.println("Annual Bonus: " + (inc_salary - salary));
	}
}

public class EmployeeManagement {
	public static void main(String[] args)
	{
		Employee e = new Employee();
		System.out.println("Enter Employee Details -");
		e.getDetails();
		e.salaryIncrease();
		e.displayDetails();
	}
}
