package com.gentech.inheritance.programs;
class Student
{
	Student(String name,int id)
	{
		System.out.println("Student name:"+name);
		System.out.println("Student ID:"+id);
	}
}
class Course extends Student
{
	String Cname;
	Course()
	{
		super("Suchin",2102);
		Cname="B.E";
		System.out.println("Course name:"+Cname);
	}
}
class Branch extends Course
{
	String Bname;
	Branch()
	{
		Bname="CS&E";
		System.out.println("Branch name:"+Bname);
	}
}
public class MultilevelParameter4 {

	public static void main(String[] args) {
	    Branch o=new Branch();

	}

}
