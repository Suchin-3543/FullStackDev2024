package com.gentech.polymorphism.assignments;
abstract class Vehicle
{
	abstract void start();
	{
		
	}
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car is starting with a key");
	}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Bike is starting with a button");
	}
}
class Bus extends Vehicle
{
	void start()
	{
		System.out.println("Bus is starting with a key");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		 Vehicle o = null;
		 
		 Car o1=new Car();
		 Bike o2=new Bike();
		 Bus o3=new Bus();
		 
		 o=o1;
		 o.start();
		 
		 o=o2;
		 o.start();
		 
		 o=o3;
		 o.start();

	}

}
