package com.gentech.returnmethod.assignments;
class SecondHalf

//check the logic 
{
	short []array(short a[])
	{
		short res[]=new short[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		return res;
	}
}

public class CharacterArray2D {

	public static void main(String[] args) {
	short a[]= {10,20,30,40,50,60,70,80,90};
	SecondHalf se=new SecondHalf();
	 short c[]=se.array(a);
	 for(int i=c.length/2;i<a.length;i++)
	 {
        System.out.println(c[i]);
 }

}
}





