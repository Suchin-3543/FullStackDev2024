package com.gentech.practice.programs;
class CubeA
{
	int[] cubee()
	{
		int[] cb=new int[10];
		for(int i=1;i<=10;i++)
		{
			cb[i-1]=i*i*i;
		}
		return cb;
	}
}
public class Cubenumbers {

	public static void main(String[] args) {
		CubeA o=new CubeA();
		int[]a=o.cubee();
		for(int j=0;j<=a.length;j++)
		{
			System.out.println(a[j]);
		}

	}

}
