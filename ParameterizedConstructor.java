package PracticeJavaPackage;

class Agent
{
	int id;
	String name;
	
	Agent (int num, String agentname){
		id = num;
		name = agentname;
		
	}

	void display() {
		System.out.println(id+" " +name);
	}

}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Agent obj = new Agent(7, "Bond");
		obj.display();

	}

}
