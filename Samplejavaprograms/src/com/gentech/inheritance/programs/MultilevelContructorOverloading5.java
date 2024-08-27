package com.gentech.inheritance.programs;
class Animals
{
	Animals(String Aname)
	{
		System.out.println("Animalname: "+Aname);
	}
	Animals(String Animalbreed,int cost)
	{
		System.out.println("Animalbreed: "+Animalbreed);
		System.out.println("cost"+cost);
	}
	
}
class Dogs extends Animals 
{
    String dogname;

    Dogs(String Aname, String Dogname) 
    {
        super(Aname);
        dogname = Dogname;
        System.out.println("Dog name: " + dogname);
    }

    Dogs(String Animalbreed, int cost) 
    {
        super(Animalbreed, cost);
        System.out.println("Dog breed: " + Animalbreed);
    }
}

class Cat extends Dogs 
{
    String Catname;

    Cat(String Aname, String Dogname, String cname) 
    {
        super(Aname, Dogname);
        Catname = cname;
        System.out.println("Cat name: " + Catname);
    }

    Cat(String Animalbreed, int cost, String cname) 
    {
        super(Animalbreed, cost);
        Catname = cname;
        System.out.println("Cat name: " + Catname);
    }
}



public class MultilevelContructorOverloading5 {
	
	public static void main(String[] args) {
		Cat c=new Cat("jully","1000","catti");
		Cat j= new Cat("Dog&cat","happy","catty");
	
		
	}

}



         
        

