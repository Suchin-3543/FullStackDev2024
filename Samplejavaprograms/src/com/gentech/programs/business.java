package com.gentech.programs;
class Product
{
	String productname;
	int pid;
	
}
class Sales
{
	int salesid;
	String salespersonname;
}
class Order
{
	int orderid;
    String place;
}
class Inventory
{
	int rating;
    int stocks;
}

public class business {

	public static void main(String[] args) {
		Product pdt=new Product();
		pdt.productname="Realme";
		pdt.pid=90;
		System.out.println("productname:"+pdt.productname);
		System.out.println("pid:"+pdt.pid);
		System.out.println("++++++++++");
		Sales sls=new Sales();
		sls.salesid=98;
		sls. salespersonname="suchin";
		System.out.println("salesid:"+sls.salesid);
		System.out.println("salespersonname:"+sls.salespersonname);
		System.out.println("++++++++++");
		Order odr=new Order();
		odr.orderid=987;
		odr.place="coorg";
		System.out.println("orderid:"+odr.orderid);
		System.out.println("place:"+odr.place);
		System.out.println("++++++++++");
		Inventory invt=new Inventory();
		invt.rating=10;
		invt.stocks=4;
		System.out.println("rating:"+invt.rating);
		System.out.println("rating:"+invt.stocks);
		
		
        
	}

}
