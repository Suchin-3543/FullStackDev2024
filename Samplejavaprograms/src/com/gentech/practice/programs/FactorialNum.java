package com.gentech.practice.programs;
class Factnum
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

public class FactorialNum {

	public static void main(String[] args) {
		Factnum o=new Factnum();
		int a=o.getFact(5);
		{
			System.out.println(a);
		}

	}

}


       