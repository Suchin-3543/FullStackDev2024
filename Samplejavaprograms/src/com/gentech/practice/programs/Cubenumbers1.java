package com.gentech.practice.programs;
class Cube
{
	int cube(int n)
	{
		return n*n*n;
	}
}
public class Cubenumbers1 {

	public static void main(String[] args) {
		Cube o=new Cube ();
		int number=5;
		int cubenumber=o.cube(number);
		System.out.println(cubenumber);
		
		

	}

}
