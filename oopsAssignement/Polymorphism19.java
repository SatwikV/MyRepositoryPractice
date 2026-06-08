package oopsAssignement;

class Camera
{
	void capture()
	{
		System.out.println("This Camera Captures HD Images.");
	}
}
class DSLCamera extends Camera
{
	void capture()
	{
		System.out.println("This Camera Captures UHD Images.");
	}
	
}

public class Polymorphism19 {

	public static void main(String[] args) {
		
		Camera sony = new DSLCamera();
		sony.capture();

	}

}
