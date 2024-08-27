package com.gentech.parameterized.programs;

class TwoWheelers2
{
	String vehiclename;
	int vehicleno;
	TwoWheelers2(String vname,int vno)
	{
		vehiclename=vname;
		vehicleno=vno;
		System.out.println("vehiclename:"+vname);
		System.out.println("vehicleno:"+vno);
		System.out.println("++++++++++");
	}
	
}
class FourWheelers2
{
	String vehiclename;
	int vehicleno;
	FourWheelers2(String vname,int vno)
	{
		vehiclename=vname;
		vehicleno=vno;
		System.out.println("vehiclename:"+vname);
		System.out.println("vehicleno:"+vno);
		System.out.println("++++++++++");
	}
	
}
class HeavyVehicles2
{
	String vehiclename;
	int vehicleno;
	HeavyVehicles2(String vname,int vno)
	{
		vehiclename=vname;
		vehicleno=vno;
		System.out.println("vehiclename:"+vname);
		System.out.println("vehicleno:"+vno);
		System.out.println("++++++++++");
	}
}

public class vehicles2 {

	public static void main(String[] args) {
		TwoWheelers2 twl=new TwoWheelers2("bike",89);
		FourWheelers2 frwl=new FourWheelers2("car",987);
		HeavyVehicles2 hvy=new HeavyVehicles2("truck",890);

	}

}
