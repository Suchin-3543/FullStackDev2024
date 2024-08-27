package com.gentech.Abstarctclass.programs;
abstract class Employee1
{
	abstract void getDetails(String empName,double salary);
}
class Employee2 extends Employee1
{
	String empName;
	double salary;
	void getDetails(String empName,double salary)
	{
		this.empName=empName;
		this.salary=salary;
		System.out.println("Employee Name :"+this.empName);
		System.out.println("salary : "+this.salary);
	}

}
public class MultilevelAbstarctmethods5 {

	public static void main(String[] args) {
		Employee2 obj1=new Employee2();
		obj1.getDetails("Rohith", 50000);
	}

}



