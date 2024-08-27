package com.gentech.practice.programs;
class TwoD
{
	int[][] TwoDArray(int x[][],int y[][])
	{
		int res[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				res[i][j]=x[i][j]+y[i][j];
			}
				
		}
		return res;
		
	}
}
public class TwodimensionalArray {

	public static void main(String[] args) {
		TwoD o=new TwoD();
		int x[][]= {{1,2,3},{4,5,6}};
		int y[][]= {{7,9,5},{8,4,2}};
		int z[][]=o.TwoDArray(x,y);
		for(int i=0;i<z.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println(z[i][j]);
			}
			//sum of all results
			int sum=0;
			for(int k=0;k<z.length;k++)
			{
				for(int j=0;j<x[k].length;j++)
				{
					sum=sum+z[k][j];
				}
			}
			System.out.println(sum);
		}
		
		//to display firstrow from result
		for(int l=0;l<z[0].length;l++)
		{
			System.out.println(z[0][l]+" ");
		}

	}

}
