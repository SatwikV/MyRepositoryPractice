package oopsAssignement;

class University
{
	static String country = "India";
	String universityName;
	
	void studentDetails(String University) 
	{
		this.universityName = University;
		System.out.println("Country of Student: " + country);
		System.out.println("University Name of Student: " + universityName);
	}
	
}

public class StaticConcepts21 {

	public static void main(String[] args) {
		University UI = new University();
		UI.studentDetails("AIMS");
		UI.studentDetails("KIMS");
		UI.studentDetails("BITS");
		

	}

}
