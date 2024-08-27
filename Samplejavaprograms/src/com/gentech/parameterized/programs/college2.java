package com.gentech.parameterized.programs;



class Student2
{
	String name;
	int usn;
	Student2(String sname,int sn)
	{
		name=sname;
		usn=sn;
		System.out.println("name:"+sname);
		System.out.println("usn:"+sn);
		System.out.println("++++++++++");
	}
}
class Library2
{
	int bookid;
	String bookname;
	Library2(int bid,String bname)
	{
		bookid=bid;
	    bookname=bname;
		System.out.println("bookid:"+bid);
		System.out.println("bookname:"+bname);
		System.out.println("++++++++++");
	}
}
class Sports2
{
	int sportsid;
    String sportsname;
    Sports2(int sid,String sname)
    {
    	sportsid=sid;
		sportsname=sname;
		System.out.println("sportsid:"+sid);
		System.out.println("sportsname:"+sname);
		System.out.println("++++++++++");
    }
}
class Computerlab2
{
	int noofstudents;
    String labname ;
    Computerlab2(int nfstudents,String lname)
    {
    	noofstudents=nfstudents;
		labname=lname;
		System.out.println("noofstudents:"+nfstudents);
		System.out.println("labname:"+lname);
	
    }
}


public class college2 {

	public static void main(String[] args) {
		Student2 std=new Student2("suchin",567);
		Library2 lib=new Library2(76,"java");
		Sports2 sps=new Sports2(768,"cricket");
		Computerlab2 clab=new Computerlab2(59,"c21ab");

	}

}
