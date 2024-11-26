class Institutions{
	String name;
	String location;
	
	Institutions(String name, String location)
	{
		this.name = name;
		this.location = location;
	}
	
	void getSummary()
	{
		System.out.println("Name - " + name);;
		System.out.println("Location - " + location);
	}
}

class School extends Institutions{
	int numberOfStudents;
	
	School(String name, String location, int numberOfStudents)
	{
		super(name, location);
		this.numberOfStudents = numberOfStudents;
	}
	
	void getSummary()
	{
		super.getSummary();
		System.out.println("Number of Students - " + numberOfStudents);
	}
}

class College extends Institutions{
	int numberOfFaculty;
	
	College(String name, String location, int numberOfFaculty)
	{
		super(name, location);
		this.numberOfFaculty = numberOfFaculty;
	}
	
	void getSummary() {
		super.getSummary();
		System.out.println("Number of Faculty - " + numberOfFaculty);
	}
}
public class EducationalInstitutions {
	public static void main(String[] args)
	{
		College c = new College("Jaypee Institute of Information Technology", "Noida", 2000);
		c.getSummary();
		
		School s = new School("Apeejay School","Nerul", 1500);
		s.getSummary();
		
	}
}
