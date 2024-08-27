package com.gentech.callbyreferenceprograms;
class callref
{
	int x,y;
	void reff(callref o)
	{
		x+=5;
		y*=5;
		System.out.println("The value of x:"+o.x);
		System.out.println("The value of y:"+o.y);
	}
}
public class Callbyreference1 {

	public static void main(String[] args) {
		callref o=new callref();
		o.x=5;
		o.y=5;
		System.out.println("The value of x:"+o.x);
		System.out.println("The value of y:"+o.y);
		o.reff(o);
		System.out.println("The value of x:"+o.x);
		System.out.println("The value of y:"+o.y);
		

	}

}
