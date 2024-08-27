package com.gentech.practice.programs;
class Customer
{
	String name;
	int age;
	Customer(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}

void display()
{
	System.out.println("name:"+name);
	System.out.println("age:"+age);
}
}



public class Thisoperator {

	public static void main(String[] args) {
		Customer o1=new Customer("suchin",22);
		o1.display();
		

	}

}

