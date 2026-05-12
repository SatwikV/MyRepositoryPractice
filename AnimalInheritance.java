package PracticeJavaPackage;

class Animal
{
	String animalName;
	
	Animal(String name)
	{
		animalName = name;
	}
	void displayAnimal()
	{
		System.out.println("Animal Name: " + animalName);
	}
}

class Dog extends Animal
{
	String breed;
	
	Dog(String name, String dogBreed)
	{
		super(name);
		breed = dogBreed;
	}
	void displaybreed() 
	{
		System.out.println(super.animalName);
		System.out.println("Breed: "+ breed);
		
	}
}

public class AnimalInheritance {

	public static void main(String[] args) {
		Dog type = new Dog("Dog","Golden Retriever");
		type.displaybreed();
		

	}

}
