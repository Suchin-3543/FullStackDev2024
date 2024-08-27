package com.gentech.returnmethod.assignments;
class IntegerArray{
	int [] halfofele(int a[])
	{
	   int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
		 res[i]=a[i];   
	}
		return res;
}
}

public class FirsthalfIntegerArray {
	public static void main(String[] args) {
		IntegerArray o=new IntegerArray ();
		int a[]= {10,20,30,40,50,60};
		int c[]=o.halfofele(a);
		 for(int j=0;j<c.length/2;j++)
		 {
			 System.out.println(c[j]);
		 }

	}
}


	
	

