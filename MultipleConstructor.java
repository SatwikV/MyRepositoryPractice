package PracticeJavaPackage;
class Employee{
	int i;
	String name;
	double Salary;
	
	Employee(){
		System.out.println("Hello Employee");  //want this to run when object is created and without calling
		
	}
	
	Employee(int id, String ename){
		i = id;
		name = ename;
		System.out.println(i+" "+name+" "+"No Salary is mentioned");
	}
	
	Employee(int id, String ename, double paisa){
		i = id;
		name = ename;
		Salary = paisa;
		
	}
	void display() {
		System.out.println(i+" "+name+" "+Salary);
	}
	
}
public class MultipleConstructor {

	public static void main(String[] args) {
		Employee Nobj = new Employee();
		Employee obj = new Employee(7,"Bond");
		obj.display();

	}

}
