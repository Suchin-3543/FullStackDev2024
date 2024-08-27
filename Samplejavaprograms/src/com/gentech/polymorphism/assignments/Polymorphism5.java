package com.gentech.polymorphism.assignments;
abstract class Appliance
{
	abstract void operating();
}
class WashingMachine extends Appliance
{
	void operating()
	{
		System.out.println("WashingMachine is operating");
	}
}
class Refrigerator extends Appliance
{
	void operating()
	{
		System.out.println("Refrigerator is operating");
	}
}
class Microwave extends Appliance
{
	void operating()
	{
		System.out.println("Microwave is operating");
	}
}
public class Polymorphism5 {

	public static void main(String[] args) {
		 Appliance o=null;
		 
		 WashingMachine o1=new WashingMachine();
		 Refrigerator o2=new Refrigerator();
		 Microwave o3=new Microwave();
		 
		 o=o1;
		 o.operating();
		 
		 o=o2;
		 o.operating();
		 
		 o=o3;
		 o.operating();
		 

	}

}
