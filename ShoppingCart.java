class Product{
	int pid,quan;
	String pName;
	double price;
	public Product(int pid, int quan, String pName, double price) {
		//super();
		this.pid = pid;
		this.quan = quan;
		this.pName = pName;
		this.price = price;
	}
	public void display(){
		System.out.println("ID: "+ pid+" Name: "+pName+" Price: "+ price+" Quantity: "+quan);
	}

}
 class Shopping {
	 public int addProduct(Product[] cart,int itemCount,Product product){
		 if(itemCount==cart.length){
			 System.out.println("cart is full");
		     return itemCount;
		 }
		 for(int i=0;i<itemCount;i++){
			 if(cart[i].pid==product.pid){
				 cart[i].quan+=product.quan;
				 System.out.println(product.pName+" quantity is increased in the cart.");
				 return itemCount;
			 }
		 }
		 cart[itemCount]=product;
		 itemCount++;
		 System.out.println(product.pName+" product added to the cart.");
		 return itemCount;
		 
	 }
	 public int removeProduct(Product[] cart,int itemCount,int pid){
		 for(int i=0;i<itemCount;i++){
			 if(cart[i].pid==pid){
				 System.out.println(cart[i].pName+" removed from the cart.");
				 //for shifting the remaining product
				 for(int j=i;j<itemCount-1;j++){
					 cart[j]=cart[j+1];
				 }
				 cart[itemCount-1]=null;
				 itemCount--;
				 return itemCount;
			 }
				 
			 }
		 System.out.println("Product not found in the cart.");
		 return itemCount;
	 }
	 public double totalPrice(Product[] cart,int itemCount){
		 double total=0;
		 for(int i=0;i<itemCount;i++){
			 total+=cart[i].price*cart[i].quan;
		 }
		 return total;
	 }
	 public void displayCart(Product[] cart, int itemCount){
		 if(itemCount==0){
			 System.out.println("cart is empty");
		 }
		 else{
			 for(int i=0;i<itemCount;i++){
				 cart[i].display();
			 }
		 }
	 }
	

}

public class ShoppingCart {
	public static void main(String[] args) {
		Product[] cart=new Product[5];
		int itemCount=0;
		Shopping sp=new Shopping();
		 Product product1 = new Product(101, 800, "Laptop", 1);
	        Product product2 = new Product(102, 500, "Phone", 2);
	        Product product3 = new Product(103, 300, "Tablet", 1);
	        itemCount = sp.addProduct(cart, itemCount, product1);
	        itemCount = sp.addProduct(cart, itemCount, product2);
	        itemCount = sp.addProduct(cart, itemCount, product3);
	        sp.displayCart(cart, itemCount);
	        itemCount = sp.removeProduct(cart, itemCount, 102); 
	        sp.displayCart(cart, itemCount);

	        
	        double totalBill = sp.totalPrice(cart, itemCount);
	        System.out.println("Total Bill: " + totalBill);
		
	}

}