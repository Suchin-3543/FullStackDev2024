package com.gentech.Abstarctclass.programs;
abstract class Subjects
{
	
	static 
	{
		System.out.println("Static block 1 executed");
	}
 }
	class Library extends Subjects
	{
		
	}
	
public class AbstractStaticblock2 {
	public static void main(String[] args)
	{
		Library o=new Library();
	}
}


