package com.gentech.praticess;
class InterA
{
	int[] intA(int a[])
	{
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}
public class Program8 {

	public static void main(String[] args) {
		InterA o = new InterA();
		int a[]= {1,2,3,4,5,6};
		int c[]=o.intA(a);
		for(int i=0;i<a.length/2;i++)
		{
			System.out.println(c[i]);
		}

	}

}
