package com.gentech.praticess;
class ShortArray
{
	short[] shortA(short a[])
	{
		short[] res=new short[a.length];
		for(int i=0;i<a.length/2;i++)
		{
			res[i]=a[i];
		}
			
		return res;
	}
}
public class Program3 {

	public static void main(String[] args) {
		ShortArray o=new ShortArray();
		short a[]= {1,2,3,4,5,6};
		 for(int i=a.length/2;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
