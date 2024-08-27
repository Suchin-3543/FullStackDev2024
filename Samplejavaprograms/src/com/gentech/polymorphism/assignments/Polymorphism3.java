package com.gentech.polymorphism.assignments;
abstract class Employee
{
	abstract void work();
}
class Manager extends Employee
{
	void work()
	{
		System.out.println("Manager is managing a team");
	}
}
class Developer extends Employee
{
	void work()
	{
		System.out.println("Developer is writing a code");
	}
}
class Intern extends Employee
{
	void work()
	{
		System.out.println("Intern is learning");
	}
}
public class Polymorphism3 {

	public static void main(String[] args) {
		 Employee o = null;
		
		 Manager o1=new  Manager();
		 Developer o2=new Developer();
		 Intern o3=new Intern();
		 
		 o=o1;
		 o.work();
		 
		 o=o2;
		 o.work();
		 
		 o=o3;
		 o.work();
		
		

	}

}
