class Employee{
	String name;
	int employeeId;
	float basicSalary;
	
	Employee(String name, int employeeId, float basicSalary){
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
	}
}

class FullTimeEmployee extends Employee{
	float annualBonus;
	
	FullTimeEmployee(String name, int employeeId, float basicSalary, float annualBonus)
	{
		super(name,employeeId,basicSalary);
		this.annualBonus = annualBonus;
	}
	
	float getTotalCompensation()
	{
		return (basicSalary + annualBonus);
	}
}

class PartTimeEmployee extends Employee{
	int hoursWorked;
	float hourlyRate;
	
	PartTimeEmployee(String name, int employeeId, float basicSalary, int hoursWorked,float hourlyRate)
	{
		super(name, employeeId, basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	float getTotalCompensation()
	{
		return hoursWorked*hourlyRate;
	}
}
public class EmployeeTypes {
	public static void main(String[] args)
	{
		FullTimeEmployee ft = new FullTimeEmployee("MK", 1, 50000, 15000);
		float amt = ft.getTotalCompensation();
		System.out.println("Compensation of Full Time Employee = " + amt);
		
		PartTimeEmployee pt = new PartTimeEmployee("PK", 2, 0, 8, 200);
		float amt1 = pt.getTotalCompensation();
		System.out.println("Compensation of Part Time Employee = " + amt1);
	}
}
