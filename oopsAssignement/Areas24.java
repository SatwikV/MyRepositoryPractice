package oopsAssignement;

class Shapee
{
	int length;
	
	void square(int l) 
	{
		this.length = l;
		System.out.println("Area of Square: " + (l*l));
	}
	void recangle(int l, int w) 
	{
		this.length = l;
		System.out.println("Area of Rectangle: " + (l*w));
		
	}
	void circle(int r) 
	{
		this.length = r;
		System.out.println("Area of Circle: " + (3.2*r*r));
		
	}
}
public class Areas24 {

	public static void main(String[] args) {
		
		Shapee box = new Shapee();
		box.square(4);
		box.recangle(4, 6);
		box.circle(5);

	}

}
