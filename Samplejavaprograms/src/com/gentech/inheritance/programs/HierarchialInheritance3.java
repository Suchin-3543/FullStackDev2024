package com.gentech.inheritance.programs;
class vehicle
{
	void start()
	{
		System.out.println("Vehicle is starting");
	}
}
class Bike extends vehicle
{
	void ride()
	{
		System.out.println("Bike is riding");
	}
}
class Car extends vehicle
{
	void drive()
	{
		System.out.println("Car is driving");
	}
}

public class HierarchialInheritance3 {

	public static void main(String[] args) {
	    Bike o1=new Bike();
	    o1.start();
	    o1.ride();
	    Car o2=new Car();
	    o2.start();
	    o2.drive();
	    

	}

}
