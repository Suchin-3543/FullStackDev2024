package com.gentech.praticess;
class IntegerAA
{
	int[] intAA(int a[])
	{
		int[] res=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class Peogram9 {

	public static void main(String[] args) {
		IntegerAA o =new IntegerAA();
		int sum=0;
		int a[]= {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
       System.out.println(sum);
	}

}
