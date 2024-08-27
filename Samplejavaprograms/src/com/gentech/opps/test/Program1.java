package com.gentech.opps.test;
class Demo1
{
	Demo1(String name,int age)
	{
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
	}
}
class Demo2 extends Demo1
{
	Demo2(String name,int age,String address)
	{
		super(name,age);
		System.out.println("Adress is: "+address);
	}
}

public class Program1 {

	public static void main(String[] args) {
		Demo2 d=new Demo2("SUchin", 20, "Coorg");

	}

}


