package com.gentech.praticess;
class Factorial
{
	int getfact(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
		fact=fact*i;
	     }
	return fact;
}
}	


public class Program5 {

	public static void main(String[] args) {
		Factorial o=new Factorial();
		int c=o.getfact(5);
		System.out.println(c);
		

	}


}


