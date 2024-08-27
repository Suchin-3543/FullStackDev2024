package com.gentech.programs;
class Employee
{
	String ename;
	int eid;
	int age;
}
class Department
{
	int deptno;
	String deptname; 
}
class Insurance
{
	int insuranceid;
	String type;
}

public class sample {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.ename="suchin";
		emp.eid=01;
		emp.age=22;
		System.out.println("ename:"+emp.ename);
		System.out.println("eid:"+emp.eid);
		System.out.println("age:"+emp.age);
		System.out.println("++++++++++");
		Department dept=new Department();
		dept.deptno=001;
		dept.deptname="sales";
		System.out.println("deptno:"+dept.deptno);
		System.out.println("deptname:"+dept.deptname);
		System.out.println("+++++++++++");
		Insurance ins=new Insurance();
		ins.insuranceid=787;
		ins.type="longterm";
		System.out.println("insuranceid:"+ins.insuranceid);
		System.out.println("type:"+ins.type);
		
	}

}
