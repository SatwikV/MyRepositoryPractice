package PracticeJavaPackage;

class LaptopData
{
	String brand;
	int ram;
	
	LaptopData()
	{
		brand = "Dell";
		ram = 16;
	}
	void display() 
	{
		System.out.println(brand +" "+ ram +"GB");
	}
	
}
public class Laptop {

	public static void main(String[] args) {
		LaptopData obj = new LaptopData();
		obj.display();
	}

}
