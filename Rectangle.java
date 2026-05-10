package PracticeJavaPackage;

class Rectangleshape
{
	double length;
	double breadth;
	
	Rectangleshape(double l, double b)
	{
		length = l;
		breadth = b;
	}
	double area() 
	{
		return length*breadth;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Rectangleshape Area = new Rectangleshape(10,5);
		System.out.println(Area.area());
	}

}
