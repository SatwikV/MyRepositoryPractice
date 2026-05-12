package PracticeJavaPackage;

class Area
{
	double radius;
	
	Area(double r)
	{
		radius = r;
	}
	
	double area() 
	{
	   return (3.14 * radius * radius);
	}
	
	double circumference() 
	{
		return (2 * 3.14 * radius);
	}
}

public class Circle {

	public static void main(String[] args) {
		Area AreaofCircle = new Area(7);
		System.out.println(AreaofCircle.area());
		System.out.println(AreaofCircle.circumference());
		
	}

}
