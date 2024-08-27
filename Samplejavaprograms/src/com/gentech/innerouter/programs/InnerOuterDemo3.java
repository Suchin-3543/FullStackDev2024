//Write a program in which outer class contains two inner private classes, it executes members of all the classes.

package com.gentech.innerouter.programs;
class Outernew3
{
	 Inner1 In =new  Inner1();
	 Inner2 Inn = new  Inner2();	
	 void showtwoinnerclass()
	{
		In.Innerclass();
		Inn.Innerclass2();
	}
	 
	
	private class Inner1
	{
		void Innerclass()
		{
		String name="Suchin";
		int id=100;
		System.out.println("Name: "+name);
      	System.out.println("id: "+id);
		}
		
			
	}
	private class Inner2
	{
		 void Innerclass2()
		{
			String name="Vidya";
			int id=101;
			System.out.println("Name: "+name);
	      	System.out.println("Id: "+id);
			
		}
		
	}
	
}

public class InnerOuterDemo3 {

	public static void main(String[] args) {
		Outernew3 o=new Outernew3();
		o.showtwoinnerclass();

	}

}

	

