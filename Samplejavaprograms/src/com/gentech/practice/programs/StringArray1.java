package com.gentech.practice.programs;
class StringA{
	void Arrayhalf(String a[])
	{
	     for(int i=(a.length)/2;i<a.length;i++)
	     {
	    	 System.out.println(a[i]);
	     }
	     
	}

}


public class StringArray1 {

	public static void main(String[] args) {
		String a[]= {"suchin","Arshii","Arya","Adithya"};
		StringA o= new StringA();
		o.Arrayhalf(a);


	}

}
