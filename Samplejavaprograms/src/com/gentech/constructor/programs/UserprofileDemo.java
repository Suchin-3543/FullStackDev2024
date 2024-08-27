package com.gentech.constructor.programs;
class Userprofile
{
	Userprofile(String name)
	{
		System.out.println("Userprofile name:"+name);
	}
	Userprofile(int id)
	{
		System.out.println("Userprofile int:"+id);
	}
	Userprofile(float age)
	{
		System.out.println("Userprofile float:"+age);
	}
	Userprofile(double salary)
	{
		System.out.println("Userprofile double:"+salary);
	}
	
}

public class UserprofileDemo {

	public static void main(String[] args) {
		Userprofile nm=new Userprofile("santosh");
		Userprofile id=new Userprofile(24);
		Userprofile ag=new Userprofile(30f);
		Userprofile sl=new Userprofile(30000d);

	}

}
