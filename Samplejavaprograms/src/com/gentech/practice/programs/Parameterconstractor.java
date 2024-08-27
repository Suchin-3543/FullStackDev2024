package com.gentech.practice.programs;
class Employee
{
	String name;
	int age;
	Employee(String nm,int ag)
	{
		String name=nm;
		int age=ag;
		System.out.println("name:"+nm);
		System.out.println("age:"+ag);
	}
}

public class Parameterconstractor {

	public static void main(String[] args) {
		Employee o1=new Employee("suchin",22);
		Employee o2=new Employee("sachin",24);
		

	}

}
