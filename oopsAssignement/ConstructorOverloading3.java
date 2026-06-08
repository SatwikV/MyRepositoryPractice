package oopsAssignement;

class Product                                //Create a class Product having instance variables productId, productName, and price.
{
	int productId;
	String productName;
	double price;
	
	Product()                                 //A default constructor that prints "Product Created".
	{
		System.out.println("Product Created");
	}
	
	Product(int id,String name, double price)   //A parameterized constructor that initializes the product details.
	{
		this.productId = id;
		this.productName = name;
		this.price = price;
	}
	
	void displayProduct()                     //Write a method displayProduct() to print product details.
	{
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
	}
	
}


public class ConstructorOverloading3 {

	public static void main(String[] args) {
		Product chocolate = new Product();                //Create both types of objects in the main method.
		chocolate.displayProduct();
		Product  nestle = new Product(001,"Kit Kat", 20);
		nestle.displayProduct();
		

	}

}
