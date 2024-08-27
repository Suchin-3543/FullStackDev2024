package com.gentech.praticess;

class FactA
{
	int factt(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Program12 {

	public static void main(String[] args) {
		FactA o=new FactA();
	    int c=o.factt(5);
		System.out.println(c);
		

	}

}
