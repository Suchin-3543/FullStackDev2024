package com.gentech.practice.programs;
class Student{
	
	Student(String name)
	{
		System.out.println("name:"+name);
	}
	Student(int age)
	{
		System.out.println("age:"+age);
	}
	
}
public class Constructordemo {

	public static void main(String[] args) {
		Student o1=new Student("Suchin");
		Student o2=new Student(22);
	}

}
