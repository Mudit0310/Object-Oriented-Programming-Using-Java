import java.util.Scanner;
class Room
{
	int roomNumber;
	String roomType;
	int ratePerNight;
	boolean availabilityStatus;
	
	Room(int roomNumber, String roomType, int ratePerNight, boolean availabilityStatus){
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.ratePerNight = ratePerNight;
		this.availabilityStatus = availabilityStatus;
	}
	
	void display()
	{
		System.out.println("Room Number : " + roomNumber);
		System.out.println("Room type: " + roomType);
		System.out.println("Rate Per Night: " + ratePerNight);
	}
	
	static int bookroom(Room[] r)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Select a room number to book a room : ");
		int rn = s.nextInt();
		System.out.println("Enter the number of days:");
		int days = s.nextInt();
		for(int i=0;i<r.length;i++)
		{
			if(rn == r[i].roomNumber)
			{
				if(!r[i].availabilityStatus)
				{
					System.out.println("This room is already booked");
				}
				else {
					r[i].availabilityStatus = false;
					System.out.println("Your room has been booked");
					int charges = r[i].ratePerNight*days;
					r[i].display();
					System.out.println("Your room charge will be: " + charges);
					break;
				}
			}
			
		}
		
		return rn ;
	}
	
	static void cancelroom(Room[] r, int number)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to cancel the room booking(yes/no):");
		String choice = s.next();
		if(choice.equals("yes"))
		{
			r[number - 101].availabilityStatus = true;
			System.out.println("Your room has been cancelled");
		}
	}
}


public class RoomBooking {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Room[] r = new Room[3];
		r[0] = new Room(101, "Single", 500, true);
		r[1] = new Room(102, "Deluxe", 600, true);
		r[2] = new Room(103, "Standard twin room", 700, true);
		for(int i=0;i<r.length;i++)
		{
			r[i].display();
		}
		
		do {
			int number = Room.bookroom(r);
			Room.cancelroom(r, number);
		}while(true);
		
	}
}
