package com.gentech.practice.programs;
class ShortA
{
	short[] shortarray(short a[])
	{
		short res[]=new short[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class SecondhalfShortarray {

	public static void main(String[] args) {
		ShortA o=new ShortA();
		short a[]= {3,9,7,5,6,1};
		short c[]=o.shortarray(a);
		for(int j=a.length/2;j<a.length;j++)
		{
			System.out.println(c[j]);
		}

	}

}
