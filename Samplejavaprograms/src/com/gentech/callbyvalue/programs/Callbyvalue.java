package com.gentech.callbyvalue.programs;
class Callbyv
{
	void cal(int x,int y)
	{
		x+=10;
		y*=2;
		System.out.println("The value of x:"+x);
		System.out.println("the of value of y:"+y);
	}
}

public class Callbyvalue {

	public static void main(String[] args) {
		int x,y;
		x=10;y=5;
		System.out.println("The value of x:"+x);
		System.out.println("The value of y:"+y);
		Callbyv o = new Callbyv();
		o.cal(x,y);
		System.out.println("The value of x:"+x);
		System.out.println("The value of y:"+y);
				

	}

}
