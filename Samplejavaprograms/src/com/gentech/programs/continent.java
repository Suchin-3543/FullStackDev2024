package com.gentech.programs;
class Country
{
	String name;
	String continent;
	
}
class State
{
	String name;
	String country;
}
class District
{
	String name;
    String state;
}
class Village
{
	String name;
    String district;
}
public class continent {

	public static void main(String[] args) {
		Country con=new Country();
		con.name="India";
		con.continent="Asia";
		System.out.println("name:"+con.name);
		System.out.println("continent:"+con.continent);
		System.out.println("++++++++++");
		State sts=new State();
		sts.name="Karnataka";
		sts.country="India";
		System.out.println("name:"+sts.name);
		System.out.println("continent:"+sts.country);
		System.out.println("++++++++++");
		District dst=new District();
		dst.name="Kodagu";
		dst.state="Karnataka";
		System.out.println("name:"+dst.name);
		System.out.println("country:"+dst.state);
		System.out.println("++++++++++");
		Village vle=new Village();
		vle.name="Mathur";
		vle.district="Kodagu";
		System.out.println("name:"+vle.name);
		System.out.println("district:"+vle.district);
		System.out.println("++++++++++");

	}

}
