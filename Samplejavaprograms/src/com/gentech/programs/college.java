package com.gentech.programs;
class Student
{
	String name;
	int usn;
	
}
class Library
{
	int bookid;
	String bookname;
}
class Sports
{
	int sportsid;
    String sportsname;
}
class Computerlab
{
	int noofstudents;
    String labname ;
}

public class college {

	public static void main(String[] args) {
		Student std=new Student();
		std.name="suchin";
		std.usn=900865;
		System.out.println("name:"+std.name);
		System.out.println("usn:"+std.usn);
		System.out.println("++++++++++");
		Library lib=new Library();
		lib.bookid=76;
		lib.bookname="java";
		System.out.println("bookid:"+lib.bookid);
		System.out.println("bookname:"+lib.bookname);
		System.out.println("++++++++++");
		Sports sps=new Sports();
		sps.sportsid=987;
		sps.sportsname="cricket";
		System.out.println("sportsid:"+sps.sportsid);
		System.out.println("sportsname:"+sps.sportsname);
		System.out.println("++++++++++");
		Computerlab clab=new Computerlab();
		clab.noofstudents=59;
		clab.labname="c2lab";
		System.out.println("noofstudents:"+clab.noofstudents);
		System.out.println("labname:"+clab.labname);
	
	}

}
