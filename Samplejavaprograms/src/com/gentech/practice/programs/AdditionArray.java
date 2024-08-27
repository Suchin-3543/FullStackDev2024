package com.gentech.practice.programs;
class Add
{
	int add(int x,int y)
	{
		int res=x+y;
	    return res;
	}
	int sub(int x,int y)
	{
		int res=x-y;
		return res;
	}
	void mul()
	{
		int a=this.add(5,10);
		int b=this.sub(10,5);
		int res=a*b;
		System.out.println(res);
	}
			
	
}
public class AdditionArray {

	public static void main(String[] args) {
		Add o=new Add();
		 int c=o.add(5,10);
		 int b=o.sub(10,5);
		 o.mul();
		 System.out.println(c);
		 System.out.println(b);
		 
	}
}


