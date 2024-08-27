package com.gentech.noargs.programs;



class Student1
{
	String name;
	int usn;
	Student1()
	{
		name="suchin";
		usn=900865;
		System.out.println("name:"+name);
		System.out.println("usn:"+usn);
		System.out.println("++++++++++");
	}
}
class Library1
{
	int bookid;
	String bookname;
	Library1()
	{
		bookid=76;
	    bookname="java";
		System.out.println("bookid:"+bookid);
		System.out.println("bookname:"+bookname);
		System.out.println("++++++++++");
	}
}
class Sports1
{
	int sportsid;
    String sportsname;
    Sports1()
    {
    	sportsid=987;
		sportsname="cricket";
		System.out.println("sportsid:"+sportsid);
		System.out.println("sportsname:"+sportsname);
		System.out.println("++++++++++");
    }
}
class Computerlab1
{
	int noofstudents;
    String labname ;
    Computerlab1()
    {
    	noofstudents=59;
		labname="c2lab";
		System.out.println("noofstudents:"+noofstudents);
		System.out.println("labname:"+labname);
	
    }
}

public class college1 {

	public static void main(String[] args) {
		Student1 std=new Student1();
		Library1 lib=new Library1();
		Sports1 sps=new Sports1();
		Computerlab1 clab=new Computerlab1();

	}

}
