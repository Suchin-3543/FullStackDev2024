package com.gentech.parameterized.programs;

class Product2
{
	String productname;
	int pid;
	 Product2(String pname,int pd)
	 {
		 productname=pname;
		 pid=pd;
		 System.out.println("productname:"+pname);
		 System.out.println("pid:"+pd);
		 System.out.println("++++++++++");
	 }
	
	
}
class Sales2
{
	int salesid;
	String salespersonname;
	Sales2(int sid,String spersonname)
	{
		salesid=sid;
		salespersonname=spersonname;
		System.out.println("salesid:"+sid);
		System.out.println("salespersonname:"+spersonname);
		System.out.println("++++++++++");
	}
}
class Order2 
{
	int orderid;
    String place;
    Order2(int oid,String pname)
    {
    	orderid=oid;
		place=pname;
		System.out.println("orderid:"+oid);
		System.out.println("place:"+pname);
		System.out.println("++++++++++");
    }
}
class Inventory2
{
	int rating;
    int stocks;
    Inventory2(int rg,int sno)
    {
    	rating=rg;
		stocks=sno;
		System.out.println("rating:"+rg);
		System.out.println("rating:"+sno);
    }
}


public class business2 {

	public static void main(String[] args) {
		Product2 pdt=new Product2("realme",78);
		Sales2 sls=new Sales2(56,"suchin");
		Order2 odr=new Order2(567,"coorg");
		Inventory2 invt=new Inventory2(10,4);

	}

}
