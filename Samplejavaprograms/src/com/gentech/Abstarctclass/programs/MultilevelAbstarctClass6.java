package com.gentech.Abstarctclass.programs;
abstract class Animals2
{
	Animals2(String Aname)
	{
		System.out.println("Animalname: "+Aname);
	}
	Animals2(String Animalbreed,int cost)
	{
		System.out.println("Animalbreed: "+Animalbreed);
		System.out.println("cost"+cost);
	}
	
}
class Dog2 extends Animals2
{
	String dogname;
	Dog2(String Aname,String Dogname)
	{
		super(Aname);
		dogname=Dogname;
		System.out.println("Dogname: "+dogname);				
	}
	Dog2(String Animalbreed,int cost )
	{
		super(Animalbreed,cost);
		System.out.println("Animalbreed: "+Animalbreed);
	}
}
class Cat2 extends Dog2
{
	String Catname;
	Cat2(String Aname,String Dogname,String cname)
	{
		super(Aname,Dogname);
		Catname=cname;
		System.out.println("Catname: "+Catname);
		
		}
	Cat2(String Animalbreed,int cost,String cname)
	{
		super(Animalbreed,cost);
		System.out.println("Catname: "+Catname);
		
	}
}

public class MultilevelAbstarctClass6 {

	public static void main(String[] args) {
		Cat2 c=new Cat2("jully","1000","catti");
		Cat2 j= new Cat2("Dog&cat","happy","catty");
		

}

}
