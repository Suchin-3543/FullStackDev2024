package com.gentech.practice.programs;
class Maths
{
	Maths(int num1,int num2,String scenario)
	{
		int res=0;
		switch(scenario)
		{
		case "add":
			res=(num1+num2);
			System.out.println("Addition result:"+res);
			break;
		case "sub":
			res=(num1-num2);
			System.out.println("Substraction result:"+res);
			break;
		case "Mul":
			res=(num1*num2);
			System.out.println("Multiplication result:"+res);
			break;
		case "div":
			res=(num1+num2);
			System.out.println("Division result:"+res);
			break;
		}
	}
}

public class MathoperatorsContructors {

	public static void main(String[] args) {
		Maths o1=new Maths(12,78,"add");
		Maths o2=new Maths(12,78,"sub");
		Maths o3=new Maths(12,78,"mul");
		Maths o4=new Maths(12,78,"div");
		

	}

}
