import java.util.Scanner;

class Book
{
	String title;
	String author;
	float price;
	int isbn;
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public void setISBN(int isbn)
	{
		this.isbn = isbn;
	}
	
	void getDetails()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Title name: ");
		setTitle(s.next());
		System.out.println("Enter Author name: ");
		setAuthor(s.next());
		System.out.println("Enter Price: ");
		setPrice(s.nextFloat());
		System.out.println("Enter ISBN code: ");
		setISBN(s.nextInt());
		s.close();
	}
	
	void discount(float discount)
	{
		price = price - price*(discount/100);
	}
	
	void displayDetails()
	{
		System.out.println("Title - " + title);
		System.out.println("Author - " + author);
		System.out.println("After Discount - " + price);
		System.out.println("ISBN Code - " + isbn);
	}
}
public class BookManagement {
	public static void main(String[] args)
	{
		Book b = new Book();
		System.out.println("Enter book details :- ");
		b.getDetails();
		b.discount(10);
		b.displayDetails();
		
	}
}
 


