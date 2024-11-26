class Product{
	int productId;
	String productName;
	
	Product(int productId, String productName)
	{
		this.productId = productId;
		this.productName = productName;
	}
	
	void displayProductInfo()
	{
		System.out.println("Product ID - " + productId);
		System.out.println("Product Name - " + productName);
	}
}

class Electronics extends Product{
	int warrantyPeriod;
	
	Electronics(int productId, String productName, int warrantyPeriod) {
		super(productId, productName);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	void displayProductInfo()
	{
		super.displayProductInfo();
		System.out.println("Warranty Period(in years) - " + warrantyPeriod);
	}
}

class Clothing extends Product{
	char size;
	
	Clothing(int productId, String productName, char size) {
		super(productId, productName);
		this.size = size;
	}
	
	void displayProductInfo()
	{
		super.displayProductInfo();
		System.out.println("Size - " + size);
	}
	
}
public class Products {
	public static void main(String[] args)
	{
		Electronics e = new Electronics(1001, "Apple", 5);
		e.displayProductInfo();
		
		Clothing c = new Clothing(1002, "Zara", 'L');
		c.displayProductInfo();
	}
}
