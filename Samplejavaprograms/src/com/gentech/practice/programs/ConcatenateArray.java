package com.gentech.practice.programs;
class Concate
{
	String concateA(String[] a)
	{
		String s=" ";
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		
		return s;
	}
}
public class ConcatenateArray {

	public static void main(String[] args) {
		Concate o=new Concate();
		String[] a= {"my","name","is","suchin"};
		String b=o.concateA(a);
		System.out.println(b);
		}

	}



