package com.gentech.parameterized.programs;


class Employee2
{
	String ename;
	int eid;
	int age;
	Employee2(String en,int id,int Age)
	{
		ename=en;
		eid=id;
		age=Age;
		System.out.println("ename:"+en);
		System.out.println("eid:"+id);
		System.out.println("age:"+Age);
	}
}
class Department2
{
	int deptno;
	String deptname; 
	Department2(int dno,String dname)
	{
		deptno=dno;
		deptname=dname;
		System.out.println("deptno:"+dno);
		System.out.println("deptname:"+dname);
		System.out.println("+++++++++++");
	}
}
class Insurance2
{
	int insuranceid;
	String type;
	Insurance2(int iid,String Type)
	{
		insuranceid=iid;
		type=Type;
		System.out.println("insuranceid:"+iid);
		System.out.println("type:"+Type);
	}
}
public class sample2 {

	public static void main(String[] args) {
		Employee2 emp=new Employee2("suchin",23,18);
		Department2 dept=new Department2(98,"sales");
		Insurance2 ins=new Insurance2(89,"longterm");


	}

}
