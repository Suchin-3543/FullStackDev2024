package com.gentech.noargs.programs;


class TwoWheelers1
{
	String vehiclename;
	int vehicleno;
	TwoWheelers1()
	{
		vehiclename="bike";
		vehicleno=789;
		System.out.println("vehiclename:"+vehiclename);
		System.out.println("vehicleno:"+vehicleno);
		System.out.println("++++++++++");
	}
	
}
class FourWheelers1
{
	String vehiclename;
	int vehicleno;
	FourWheelers1()
	{
		vehiclename="car";
		vehicleno=7899;
		System.out.println("vehiclename:"+vehiclename);
		System.out.println("vehicleno:"+vehicleno);
		System.out.println("++++++++++");
	}
	
}
class HeavyVehicles1
{
	String vehiclename;
	int vehicleno;
	HeavyVehicles1()
	{
		vehiclename="truck";
		vehicleno=890;
		System.out.println("vehiclename:"+vehiclename);
		System.out.println("vehicleno:"+vehicleno);
		System.out.println("++++++++++");
	}
}

public class vehicles1 {

	public static void main(String[] args) {
		TwoWheelers1 twl=new TwoWheelers1();
		FourWheelers1 frwl=new FourWheelers1();
		HeavyVehicles1 hvy=new HeavyVehicles1();

	}

}
