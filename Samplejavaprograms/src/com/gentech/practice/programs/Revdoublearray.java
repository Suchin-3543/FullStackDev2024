package com.gentech.practice.programs;


class RevDouble
{
	double[] revdoubleA(double a[])
	{
		double res[]=new double[a.length];
		for(int j=a.length-1;j>=0;j--)
		{
			res[a.length-j-1]=a[j]; 
		}
		return res;
	}
}

public class Revdoublearray {

	public static void main(String[] args) {
		RevDouble o=new RevDouble();
		double a[]={2.9,6.7,2.2,8.9};
		double b[]=o.revdoubleA(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		
		

	}

}
