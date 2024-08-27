package com.gentech.practice.programs;
class SquareA
{
	int[] Squaree()
	{
		int[] sq=new int[10];
		for(int i=1;i<=10;i++)
		{
			sq[i-1]=i*i;
		}
		return sq;
		
	}
			
}

public class Squaree1 {

	public static void main(String[] args) {
		SquareA o=new SquareA();
		int res[]=o.Squaree();
		for(int j=0;j<res.length;j++)
		{
			System.out.println(res[j]);
		}
		

	}

}
