package com.gentech.polymorphism.assignments;
abstract class Device
{
	abstract void turnon();
}
class Laptop extends Device
{
	void turnon()
	{
		System.out.println("Laptop is booting up");
	}
	
}
class Smartphone extends Device
{
	void turnon()
	{
		System.out.println("Smartphone is powering up");
	}
}
class Tablet extends Device
{
	void turnon()
	{
		System.out.println("Tablet is starting up");
	}
}

public class Polymorphism4 
{

	public static void main(String[] args) 
	{
		Device o=null;
		
		Laptop o1=new Laptop();
		Smartphone o2=new Smartphone();
		Tablet o3=new Tablet();
		
		o=o1;
		o.turnon();
		
		o=o2;
		o.turnon();
		
		o=o3;
		o.turnon();

	}

}
