package com.gentech.practice.programs;
class IsPrime
{
	IsPrime(int num)
	{
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag+=0;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+"is a prime number");
		}
		else
		{
			System.out.println(num+"is not a prime number");
		}
	}
	
}

public class Constructorprime {

	public static void main(String[] args) {
		IsPrime o1=new IsPrime(45);
		IsPrime o2=new IsPrime(65);
		IsPrime o3=new IsPrime(89);
		IsPrime o4=new IsPrime(78);
		IsPrime o5=new IsPrime(90);

	}

}
