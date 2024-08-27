package com.gentech.practice.programs;
class IntA
{
	int[] intA(int a[][])
	{
		int[] res=new int[a[1].length];
		for(int i=0;i<a[1].length;i++)
		{
			res[i]=a[1][i];
		}
		return res;
	}
}

public class Integer2DArray {

	public static void main(String[] args) {
		IntA o=new IntA();
		int a[][]= {{1,2,3},{4,5,6}};
		int c[]=o.intA(a);
		for(int j=0;j<a[1].length;j++)
		{
			System.out.println(c[j]);
		}

	}

}
