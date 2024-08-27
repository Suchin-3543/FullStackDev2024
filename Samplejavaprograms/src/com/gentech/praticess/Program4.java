package com.gentech.praticess;
class DoubleArray
{
	double[] doubleA(int a[])
	{
		double[] res=new double[a.length];
		for(int i=a.length-1;i>=0;i--)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Program4 {

	public static void main(String[] args) {
		DoubleArray o=new DoubleArray();
		int a[]= {1,2,3,4,4,5,6};
		double c[]=o.doubleA(a);
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
		
		

	}

}
