package oopsAssignement;

abstract class Animal               //Create an abstract class Animal with an abstract method sound().
{ 
	abstract void sound();
	
}

class Dog extends Animal            ///Create two subclasses Dog and Cat and provide implementation for sound() method.
{
	void sound() 
	{
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal
{
	void sound() 
	{
		System.out.println("Cat Meows");
	}
}

public class Abstraction5 {

	public static void main(String[] args) {
		
		Cat kitten = new Cat();                  //Create objects and call sound() for each.
		kitten.sound();
		Dog pet = new Dog();
		pet.sound();

	}

}
