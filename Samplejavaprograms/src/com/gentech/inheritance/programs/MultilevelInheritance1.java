package com.gentech.inheritance.programs;
class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
	
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Puppy extends Dog
{
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
public class MultilevelInheritance1 {

	public static void main(String[] args) {
		Puppy o = new Puppy();
		o.eat();
		o.bark();
		o.sleep();

	}

}
