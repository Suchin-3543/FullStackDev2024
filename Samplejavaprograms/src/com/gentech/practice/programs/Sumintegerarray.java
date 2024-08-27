package com.gentech.practice.programs;


class InterA
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

public class Sumintegerarray {

	public static void main(String[] args) {
        int sum=0;
		
		IntegerArray o=new IntegerArray();
		int a[]= {10,30};
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];
		}
		System.out.println("Sum of result elements:"+sum);
	}

}




