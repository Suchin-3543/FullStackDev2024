package com.gentech.parameterized.programs;


class Country2
{
	String name;
	String continent;
	Country2(String conname,String cname)
	{
		name=conname;
		continent=cname;
		System.out.println("name:"+conname);
		System.out.println("continent:"+cname);
		System.out.println("++++++++++");
	}
	
}
class State2
{
	String name;
	String country;
	State2(String sname,String cname)
	{
	    name=sname;
	    country=cname;
		System.out.println("name:"+sname);
		System.out.println("continent:"+cname);
		System.out.println("++++++++++");
	}
};
class District2
{
	String name;
    String state;
    District2(String dname,String sname)
    {
    	name=dname;
		state=sname;
		System.out.println("name:"+dname);
		System.out.println("country:"+sname);
		System.out.println("++++++++++");
    }
}
class Village2
{
	String name;
    String district;
    Village2(String vname,String dname)
    {
    	name=vname;
		district=dname;
		System.out.println("name:"+vname);
		System.out.println("district:"+dname);
		System.out.println("++++++++++");
    }
}

public class continent2 {

	public static void main(String[] args) {
		Country2 con=new Country2("India","Asia");
		State2 sts=new State2("Karnataka","India");
		District2 dst=new District2("Kodagu","Karnataka");
		Village2 vle=new Village2("Mathur","Kodagu");

	}

}
