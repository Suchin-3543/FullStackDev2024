package com.gentech.opps.test;
class CallReference
{
  int x,y;
  void cal(CallReference o)
  {

		o.x+=4;
		o.y*=2;
		System.out.println("The value of x:"+o.x);
		System.out.println("The value of y:"+o.y);
		
  }
}
public class Program4 {

	public static void main(String[] args) {
		CallReference o=new CallReference();
		o.x=4;
		o.y=2;
		System.out.println("The value of x:"+o.x);
		System.out.println("The value of y:"+o.y);
		o.cal(o);
		System.out.println("The value of x:"+o.x);
		System.out.println("The value of y:"+o.y);
  

	}

}
