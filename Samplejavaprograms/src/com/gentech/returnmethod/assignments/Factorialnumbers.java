package com.gentech.returnmethod.assignments;
class Factorial
{
    int getFact(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
           fact=fact*i;
        }
        return fact;
    }
}


public class Factorialnumbers {

	public static void main(String[] args) {
		 Factorial f=new Factorial();
	        int c=f.getFact(2);
	        System.out.println("factorial is "+c);

	}

}
