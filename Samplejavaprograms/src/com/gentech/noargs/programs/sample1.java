package com.gentech.noargs.programs;


class Employee1
{
	String ename;
	int eid;
	int age;
	Employee1()
	{
		ename="suchin";
		eid=01;
		age=22;
		System.out.println("ename:"+ename);
		System.out.println("eid:"+eid);
		System.out.println("age:"+age);
	}
}
class Department1
{
	int deptno;
	String deptname; 
	Department1()
	{
		deptno=001;
		deptname="sales";
		System.out.println("deptno:"+deptno);
		System.out.println("deptname:"+deptname);
		System.out.println("+++++++++++");
	}
}
class Insurance1
{
	int insuranceid;
	String type;
	Insurance1()
	{
		insuranceid=787;
		type="longterm";
		System.out.println("insuranceid:"+insuranceid);
		System.out.println("type:"+type);
	}
}

public class sample1 {

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		Department1 dept=new Department1();
		Insurance1 ins=new Insurance1();

	}

}
