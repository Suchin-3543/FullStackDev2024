package com.gentech.practice.programs;
class Completetab
{
	int[] tables(int num)
	{
		int[] res=new int[11];
		for(int i=10;i>=1;i--)
		{
			res[i]=num*i;
		}
		return res;
	}
}

public class CompleteTable {

	public static void main(String[] args) {
		Completetab o=new Completetab();
		int[] a=o.tables(5);
		for(int i=a.length-1;i>=1;i--)
		System.out.println("5*"+i+"="+a[i]);

	}

}
