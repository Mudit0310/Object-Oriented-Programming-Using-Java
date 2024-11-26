import java.util.Scanner;
class ProductInventory{
	int productID;
	String productName;
	int stockQuantity;
	double price;
	
	ProductInventory(int productID, String productName, int stockQuantity, double price)
	{
		this.productID = productID;
		this.productName = productName;
		this.stockQuantity = stockQuantity;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Product ID : " + productID);
		System.out.println("Product Name : " + productName);
		System.out.println("Stock Quantity : " + stockQuantity);
		System.out.println("Price : " + price);
	}
	
	static void operation(ProductInventory[] pi)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the operation to perform:");
		System.out.println("1. Add Stock");
		System.out.println("2. Remove Stock");
		System.out.println("3. Display Stock");
		System.out.println("4. Exit");
		int num = s.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("Enter ID:");
			int id = s.nextInt();
			System.out.println("Enter the Quantity:");
			int qty = s.nextInt();
			addQuantity(qty, id, pi);
			break;
		case 2:
			System.out.println("Enter ID:");
			int id1 = s.nextInt();
			System.out.println("Enter Quantity:");
			int qty1 = s.nextInt();
			removeQuantity(qty1, id1, pi);
			break;
		case 3:
			System.out.println("Enter ID");
			int id2 = s.nextInt();
			displayStock(id2, pi);
			break;
		case 4:
			System.out.println("Exiting...");
			break;
		}
		
	}
	
	static void addQuantity(int qty, int id, ProductInventory[] pi)
	{
		boolean found = false;
		for(int i =0;i<pi.length;i++)
		{
			found = true;
			if(pi[i].productID == id)
			{
				pi[i].stockQuantity += qty;
				System.out.println("Quantity Added");
				System.out.println("Updated Quantity:" + pi[i].stockQuantity);
			}
		}
		if(!found)
		{
			System.out.println("Invalid ID");
		}
	}
	
	static void removeQuantity(int qty1, int id, ProductInventory[] pi)
	{
		boolean found = false;
		for(int i=0;i<pi.length;i++)
		{
			if(pi[i].productID == id)
			{
				found = true;
				pi[i].stockQuantity -= qty1;                                   
				System.out.println("Quantity Removed");
				System.out.println("Updated Quantity:"+pi[i].stockQuantity);
			}
		}
		if(!found)
		{
			System.out.println("ID not found");
		}
	}
	
	static void displayStock(int id2, ProductInventory[] pi)
	{
		System.out.println("Name of Stock : " + pi[id2].productName);
		System.out.println("Quantity of stock : " + pi[id2].stockQuantity);
		System.out.println("Price of stock : " + pi[id2].price);
	}
}
public class InventoryManagement{
	public static void main(String[] args)
	{
		ProductInventory[] pi = new ProductInventory[3];
		pi[0] = new ProductInventory(0,"abc",50, 40000);
		pi[1] = new ProductInventory(1,"xyz",40, 50000);
		pi[2] = new ProductInventory(2,"mno",80, 70000);
		
		for(int i=0;i<pi.length;i++)
		{
			pi[i].display();
		}
		
		do {
			ProductInventory.operation(pi);
		}while(true);
	}
}