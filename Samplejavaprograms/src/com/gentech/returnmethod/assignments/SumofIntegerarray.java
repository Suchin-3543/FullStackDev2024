package com.gentech.returnmethod.assignments;
class IntergerArray
{
	int[] sumint(int a[]) 
	{
		 int res[]=new int[a.length];
		 for(int i=0;i<a.length;i++)
			{
			 res[i]=a[i];   
		}
			return res;
	}
}
	


public class SumofIntegerarray {

	public static void main(String[] args) {
		int sum=0;
		
		IntegerArray o=new IntegerArray();
		int a[]= {1,2,3,4,5};
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
		System.out.println("Sum of result elements:"+sum);


	}


}



