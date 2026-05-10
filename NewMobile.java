package PracticeJavaPackage;

class M1
{
	String brand;
	double price;
	
	M1(String B, double P)
	{
		brand = B;
		price = P;
	}
	
	void display() 
	{
		System.out.println(brand+ " "+price);
	}


}


public class NewMobile {

	public static void main(String[] args)
	{
		M1 Obj = new M1("Samsung",45000);
		Obj.display();

	}

}
