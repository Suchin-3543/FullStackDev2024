package com.gentech.practice.programs;
class IntArray
{
	int[] intA(int a[])
	{
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
	    return res;
	}
	
}

public class IntegerArray {

	public static void main(String[] args) {
		IntArray o=new IntArray();
		int b[]= {1,5,6,3,6,3};
	    int c[]=o.intA(b);
	    for(int j=0;j<b.length/2;j++)
	    {
	    System.out.println(c[j]);	
	    }
	}

}

