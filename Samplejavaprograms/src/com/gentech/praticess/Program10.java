package com.gentech.praticess;


class ShortA
{
	int[] shortA(int a[])
	{
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Program10 {

	public static void main(String[] args) {
		ShortA o =new ShortA();
		int a[]= {1,2,3,4,5,6};
		int c[]=o.shortA(a);
	    for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(c[i]);
		}
		
		

	}

}
