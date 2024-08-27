package com.gentech.programs;
class TwoWheelers
{
	String vehiclename;
	int vehicleno;
	
}
class FourWheelers
{
	String vehiclename;
	int vehicleno;
}
class HeavyVehicles
{
	String vehiclename;
	int vehicleno;
}

public class vehicles {

	public static void main(String[] args) {
		TwoWheelers twl=new TwoWheelers();
		twl.vehiclename="bike";
		twl.vehicleno=789;
		System.out.println("vehiclename:"+twl.vehiclename);
		System.out.println("vehicleno:"+twl.vehicleno);
		System.out.println("++++++++++");
		FourWheelers frwl=new FourWheelers();
		frwl.vehiclename="car";
		frwl.vehicleno=7899;
		System.out.println("vehiclename:"+frwl.vehiclename);
		System.out.println("vehicleno:"+frwl.vehicleno);
		System.out.println("++++++++++");
		HeavyVehicles hvy=new HeavyVehicles();
		hvy.vehiclename="truck";
		hvy.vehicleno=890;
		System.out.println("vehiclename:"+hvy.vehiclename);
		System.out.println("vehicleno:"+hvy.vehicleno);
		System.out.println("++++++++++");
		


	}

}
