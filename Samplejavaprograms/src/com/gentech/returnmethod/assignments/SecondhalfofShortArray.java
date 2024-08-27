package com.gentech.returnmethod.assignments;
class ShortArray
{
	short[] ShortA(short a[])
	{
		 short res[]=new short[a.length];
		 for(short i=0;i<a.length;i++)
			{
			 res[i]=a[i];   
		}
			return res;
	}
}

public class SecondhalfofShortArray {

	public static void main(String[] args) {
		ShortArray o=new ShortArray();
		short a[]= {1,2,5,9,7,10};
	    for(int i=a.length/2;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
		
		

	}

}
