package com.gentech.constructor.programs;
class Contractab
{
	Contractab(String name)
	{
		System.out.println("Contractab name:"+name);
	}
		Contractab(int price)
	{
		System.out.println("Contractab int:"+price);
	}
		Contractab(float id)
	{
		System.out.println("Contractab float:"+id);
	}
		Contractab(double license)
	{
		System.out.println("Contractab double:"+license);
	}
		Contractab(short value)
	{
		System.out.println("Contractabshort:"+value);
	}
}
	

public class contractorsdemo {

	public static void main(String[] args) {
		Contractab nm=new Contractab("riyaa");
        Contractab pr=new Contractab(30);
        Contractab id=new Contractab(99889f);
        Contractab lc=new Contractab(05d);
        Contractab vl=new Contractab(2);
	}

}
