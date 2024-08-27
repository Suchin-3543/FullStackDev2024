package com.gentech.practice.programs;
class IntegerA
{
	void IntA(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
public class IntegerArray2 {

	public static void main(String[] args) {
	int a[]= {2,9,7,9};
	IntegerA o=new IntegerA();
	o.IntA(a);
	
		

	}

}


