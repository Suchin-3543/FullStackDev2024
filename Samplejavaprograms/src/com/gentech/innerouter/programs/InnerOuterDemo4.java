//Write a program in which outer class contains two inner static classes.Write a program to execute members of all two class. 

package com.gentech.innerouter.programs;
class Outernew4
{
	 Inner3 In =new  Inner3();
	 Inner4 Inn = new  Inner4();	
	 void showtwoinnerclass()
	{
		In.Innerclass();
		Inn.Innerclass4();
	}
	 
	
	static class Inner3
	{
		void Innerclass()
		{
		String name="Suchin";
		int id=2223;
		System.out.println("Name: "+name);
      	System.out.println("Id: "+id);
		}
		
			
	}
	static class Inner4
	{
		 void Innerclass4()
		{
			String name="Pooja";
			int id=2032;
			System.out.println("Name: "+name);
	      	System.out.println("Id: "+id);
			
		}
		
	}
	
}

public class InnerOuterDemo4 {

	public static void main(String[] args) {
		Outernew4 o=new Outernew4();
		o.showtwoinnerclass();


	}

}

