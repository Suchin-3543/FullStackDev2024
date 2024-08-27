package com.gentech.praticess;
class IntegerArray
{
	int[] intarray(int a[])
	{
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
			
		}
		return res;
	}
}

public class Program1 {

	public static void main(String[] args) {
		IntegerArray o=new IntegerArray();
		int[] a= {1,2,3,4,5,6};
		int c[]=o.intarray(a);
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println(c[i]);
		}

	}

}
