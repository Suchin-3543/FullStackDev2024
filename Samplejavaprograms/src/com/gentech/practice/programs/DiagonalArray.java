package com.gentech.practice.programs;
class DiagonalA
{
	int[] diagonal2D(int a[][])
	{
		int[] res=new int[a[0].length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i][i];
		}
		return res;
			
	}
}

public class DiagonalArray {

	public static void main(String[] args) {
		DiagonalA o=new DiagonalA();
		int a[][]= {{2,7,9},{6,3,8},{1,9,6}};
		int b[]=o.diagonal2D(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
				

	}

}
