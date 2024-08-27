package com.gentech.praticess;
class InterArray
{
	int[] intarrayy(int a[])
	{
		int[] res=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Program2 {

	public static void main(String[] args) {
		InterArray o=new InterArray();
		int sum=0;
		int a[]= {1,2,3};
		int c[]=o.intarrayy(a);
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
         System.out.println(sum);
	}

}
