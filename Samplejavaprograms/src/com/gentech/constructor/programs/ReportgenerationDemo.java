package com.gentech.constructor.programs;
class Report
{
	Report(String name)
{
	System.out.println("Report name:"+name);
}
	Report(int id)
{
	System.out.println("Report int:"+id);
}
	Report(float author)
{
	System.out.println("Report float:"+author);
}
	Report(double pgcount)
{
	System.out.println("Report double:"+pgcount);
}
	Report(short type)
{
	System.out.println("Report:"+type);
}
}


public class ReportgenerationDemo {

	public static void main(String[] args) {
		Report nm=new Report("computer");
		Report id=new Report(97);
		Report at=new Report(90f);
		Report pg=new Report(90d);
		Report ty=new Report(7);
	}

}
