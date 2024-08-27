package com.gentech.practice.programs;
class BooleanA
{
	void Barray(Boolean a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	
	
	}
public class BooleanArray3 {

	public static void main(String[] args) {
		Boolean a[]= {true,false,false,true};
		BooleanA o=new BooleanA();
		o.Barray(a);
		

	}

}

