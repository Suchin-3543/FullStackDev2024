package com.gentech.opps.test;
class Student 
{
    private String name;
	private int age;

public String getName() 
   {
	   return name;
   }
public void setName(String name) 
   {
	   this.name = name;
   }

public int getAge() 
   {
	     return age;
   }

public void setAge(int age) 
   {
	    this.age = age;
	     
	}

}
public class Program8 {
	public static void main(String[] args) {
	    
	     Student student = new Student();
	     student.setName("Suchin");
	     student.setAge(23);
	     System.out.println("Student Name: " + student.getName());
	     System.out.println("Student Age: " + student.getAge());
	     
	    }
	}



