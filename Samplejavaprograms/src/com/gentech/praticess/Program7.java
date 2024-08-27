package com.gentech.praticess;
class Array2D
{
	int[] array2D(int a[][])
	{
		int res[]=new int[a[0].length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i][i];
		}
			
		return res;
	}
}

public class Program7 {

	public static void main(String[] args) {
		Array2D o = new Array2D();
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[]=o.array2D(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
