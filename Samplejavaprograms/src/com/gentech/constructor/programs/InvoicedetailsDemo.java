package com.gentech.constructor.programs;
class Techvoice
{
	Techvoice(String name)
{
	System.out.println("Techvoice name:"+name);
}
	Techvoice(int id)
{
	System.out.println("Techvoice int:"+id);
}
	Techvoice(float quantity)
{
	System.out.println("Techvoice float:"+quantity);
}
	Techvoice(double price)
{
	System.out.println("Techvoice double:"+price);
}
	Techvoice(short discount)
{
	System.out.println("Techvoice short:"+discount);
}
}
public class InvoicedetailsDemo {

	public static void main(String[] args) {
		Techvoice nm=new Techvoice("abc");
		Techvoice id=new Techvoice(2345);
		Techvoice qt=new Techvoice(50f);
		Techvoice pr=new Techvoice(2000d);
		Techvoice ds=new Techvoice(100);
	}

}
