package com.gentech.opps.test;
abstract class One
{
	void displayname()
	{
		System.out.println("name is Suchin");
	}
	static
	{
		System.out.println("age is 23");
		System.out.println("it is a static block");
	}
}
class Two extends One
{
    void Classtwo()
    {
    	System.out.println("it is class two");
    }
}
public class Program3 {

	public static void main(String[] args) {
		Two t=new Two();
		t.Classtwo();
		t.displayname();
	}

}



