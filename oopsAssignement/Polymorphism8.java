package oopsAssignement;

class Shape
{
	void area() 
	{
		
	}
}
class Rectangle extends Shape
{
	void area() 
	{
		System.out.println("This is the area of Rectangle shape object");
	}
}
class Circle extends Shape
{
	void area() 
	{
		System.out.println("This is the area of Circle shape object");
	}
}
public class Polymorphism8 {

	public static void main(String[] args) {
		
		Shape box = new Rectangle();
		box.area();
		Shape can = new Circle();
		can.area();
		
	}

}
