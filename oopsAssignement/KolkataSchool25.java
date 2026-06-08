package oopsAssignement;

class KolkataSchool
{
	String name;
	
	KolkataSchool(String name)
	{
		this.name = name;
		System.out.println("Welcome to the High School " + name);
	}
	void dispaly() 
	{
		System.out.println("This School is based out of Kolkata");
	}
	
	
}

public class KolkataSchool25 {

	public static void main(String[] args) {
		KolkataSchool TIMS = new KolkataSchool("BABA");
		TIMS.dispaly();
		

	}

}
