package com.gentech.noargs.programs;



class Country1
{
	String name;
	String continent;
	Country1()
	{
		name="India";
		continent="Asia";
		System.out.println("name:"+name);
		System.out.println("continent:"+continent);
		System.out.println("++++++++++");
	}
	
}
class State1
{
	String name;
	String country;
	State1()
	{
	    name="Karnataka";
	    country="India";
		System.out.println("name:"+name);
		System.out.println("continent:"+country);
		System.out.println("++++++++++");
	}
}
class District1
{
	String name;
    String state;
    District1()
    {
    	name="Kodagu";
		state="Karnataka";
		System.out.println("name:"+name);
		System.out.println("country:"+state);
		System.out.println("++++++++++");
    }
}
class Village1
{
	String name;
    String district;
    Village1()
    {
    	name="Mathur";
		district="Kodagu";
		System.out.println("name:"+name);
		System.out.println("district:"+district);
		System.out.println("++++++++++");
    }
}

public class continent1 {

	public static void main(String[] args) {
		Country1 con=new Country1();
		State1 sts=new State1();
		District1 dst=new District1();
		Village1 vle=new Village1();

	}

}
