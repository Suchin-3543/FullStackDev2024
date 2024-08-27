package com.gentech.noargs.programs;



class Product1
{
	String productname;
	int pid;
	 Product1()
	 {
		 productname="Realme";
		 pid=90;
		 System.out.println("productname:"+productname);
		 System.out.println("pid:"+pid);
		 System.out.println("++++++++++");
	 }
	
	
}
class Sales1
{
	int salesid;
	String salespersonname;
	Sales1()
	{
		salesid=98;
		salespersonname="suchin";
		System.out.println("salesid:"+salesid);
		System.out.println("salespersonname:"+salespersonname);
		System.out.println("++++++++++");
	}
}
class Order1 
{
	int orderid;
    String place;
    Order1()
    {
    	orderid=987;
		place="coorg";
		System.out.println("orderid:"+orderid);
		System.out.println("place:"+place);
		System.out.println("++++++++++");
    }
}
class Inventory1
{
	int rating;
    int stocks;
    Inventory1()
    {
    	rating=10;
		stocks=4;
		System.out.println("rating:"+rating);
		System.out.println("rating:"+stocks);
    }
}

public class business1 {

	public static void main(String[] args) {
		Product1 pdt=new Product1();
		Sales1 sls=new Sales1();
		Order1 odr=new Order1();
		Inventory1 invt=new Inventory1();

	}

}
