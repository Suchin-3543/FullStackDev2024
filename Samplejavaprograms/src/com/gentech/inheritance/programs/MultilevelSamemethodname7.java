package com.gentech.inheritance.programs;
class Continent 
{
    void display1(String name) 
    {
        System.out.println("State name in Continent Class: " + name);
    }
}
class Country extends Continent 
{
	 Country(String name)
	 {
        super.display1(name);
     }

    void display1(String name) 
    {
        System.out.println("State name in  Country Class: " + name);
    }
}

class District extends  Country
{
	District(String name)
	{
        super(name);
        super.display1(name);
    }
    void display1(String name)
    {
        System.out.println("State name in District Class: " + name);
    }
}
public class MultilevelSamemethodname7 {

	public static void main(String[] args) {
		District o = new District("Karnataka");
		o.display1("Gujrat");
	
	}

}
