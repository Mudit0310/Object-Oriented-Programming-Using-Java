import java.util.Scanner;
class Car{
	int id;
	String carModel;
	int registrationNumber;
	int rentalPerDay;
	boolean availability;
	
	Car(int id, String carModel, int registrationNumber,int rentalPerDay, boolean availability)
	{
		this.id = id;
		this.carModel = carModel;
		this.registrationNumber = registrationNumber;
		this.rentalPerDay =rentalPerDay;
		this.availability = availability;
	}
	
	void display()
	{
		System.out.println("ID: " + id);
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Registration Number: " + registrationNumber);
		System.out.println("Rental Per Day: " + rentalPerDay);
	}

	public static void cancelCar(Car[] c, int number) {
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to cancel the car(yes/no):");
		String choice = s.next();
		if(choice.equals("yes"))
		{
			c[number - 101].availability = true;
			System.out.println("Your car has been returned");
		}
		
	}

	static int bookCar(Car[] c) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Car ID Number:");
		int num = s.nextInt();
		for(int i=0;i<c.length;i++)
		{
			if(c[i].id == num)
			{
				if(!c[i].availability)
				{
					System.out.println("This car has already been booked");
				}
				else {
					c[i].availability = false;
					System.out.println("Enter number of days:");
					int n = s.nextInt();
					System.out.println(c[i].carModel + "has been rented");
					c[i].display();
					System.out.println("Charges = " + c[i].rentalPerDay*n);
					break;
				}
			}
			
		}
		return num;
	}
}
public class CarRental{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Car[] c = new Car[3];
		c[0] = new Car(101,"Honda", 75554585, 400, true);
		c[1] = new Car(102,"BMW", 75558745, 600, true);
		c[2] = new Car(103,"Audi", 75589111, 800, true);
		
		for(int i=0;i<c.length;i++)
		{
			c[i].display();
		}
		
		do {
			int number = Car.bookCar(c);
			Car.cancelCar(c, number);
		}while(true);
		
		
		
		
	}
	
}