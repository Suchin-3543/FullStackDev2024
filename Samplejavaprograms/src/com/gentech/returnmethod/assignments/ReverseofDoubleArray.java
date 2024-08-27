package com.gentech.returnmethod.assignments;
class DoubleArray
{
	double [] doubleA(double a[])
	{
		double res[]=new double[a.length];
		 for(int i=a.length-1;i>=0;i--)
			{
			 res[a.length-1-i]=a[i];   
		}
			return res;
	}
}
	
public class ReverseofDoubleArray {

	public static void main(String[] args) {
		DoubleArray o=new DoubleArray();
		double a[]= {9.0d,4.7d,8.4d,3.6d};
		double b[]=o.doubleA(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
			

	}

}
