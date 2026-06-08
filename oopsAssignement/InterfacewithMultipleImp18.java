package oopsAssignement;

interface Transport 
{
	void booking();
}

class Bus implements Transport
{
	public void booking() 
	{
		System.out.println("This is an Bus booking");
	}
}
class Flight implements Transport
{
	public void booking() 
	{
		System.out.println("This is an Flight booking");
	}
	
}


public class InterfacewithMultipleImp18 {

	public static void main(String[] args) {
		Transport ticket = new Bus();
		ticket.booking();
		Transport ticket2 = new Flight();
		ticket2.booking();

	}

}
