package com.gentech.constructor.programs;
class Product
{
	Product(String name)
{
	System.out.println("Product name:"+name);
}
	Product(int price)
{
	System.out.println("Product int:"+price);
}
	Product(float version)
{
	System.out.println("Product float:"+version);
}
	Product(double license)
{
	System.out.println("Product double:"+license);
}
	Product(short discount)
{
	System.out.println("Product short:"+discount);
}
}	

public class SoftwareproductDemo {

	public static void main(String[] args) {
		Product nm=new Product("laptop");
		Product pr=new Product(75000);
		Product vr=new Product(12f);
		Product lc=new Product(2344467d);
		Product ds=new Product(1100);
	}

}
