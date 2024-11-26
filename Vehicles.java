class Vehicle{
	String make;
	String model;
	
	Vehicle(String make, String model)
	{
		this.make = make;
		this.model = model;
	}
	
	void displayDetails()
	{
		System.out.println("Make - " + make);
		System.out.println("Model - " + model);
	}
}

class Car extends Vehicle{
	int numberOfDoors;
	
	Car(String make, String model, int numberOfDoors)
	{
		super(make,model);
		this.numberOfDoors = numberOfDoors;	
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of Doors - " + numberOfDoors);
	}
}

class Truck extends Vehicle{
	float cargoCapacity;
	
	Truck(String make, String model, float cargoCapacity)
	{
		super(make,model);
		this.cargoCapacity = cargoCapacity;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("Cargo Capacity - " + cargoCapacity);
	}
}
public class Vehicles {
	public static void main(String[] args) {
		Car c = new Car("Honda", "City", 5);
		c.displayDetails();
		
		Truck t = new Truck("Tata", "Neo", 25.6f);
		t.displayDetails();
	}
}

