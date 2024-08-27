package com.gentech.praticess;
class Intrev
{
	int[] intrevv(int a[])
	{
		int res[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			res[a.length-1-i]=a[i];
		}
		return res;
		
	}
}

public class Program11 {

	public static void main(String[] args) {
		Intrev o=new Intrev();
		int a[]= {1,2,3,4};
		int c[]=o.intrevv(a);
		for(int i=0;i<=c.length;i++)
		{
			System.out.println(c[i]);
		}

	}

}
