package com.gentech.practice.programs;


class DoubleArray
{
	void sum(int a[][])
	{
		int sum=0;
		for( int k: a[1])
		{
			System.out.println(k);
			sum+=k;
		}
		System.out.println("Sum is Sum "+sum);
	}
}
public class DoubleArray5 {

	public static void main(String[] args) {
		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		DoubleArray o= new DoubleArray();
		o.sum(a);

	}

}
	
	
