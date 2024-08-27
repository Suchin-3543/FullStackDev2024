package com.gentech.practice.programs;
class FirstR
{
	char[] charA(char a[][])
	{
		char[] res=new char[a[1].length];
		for(char i=0;i<a[1].length;i++)
		{
		   res[i]=a[1][i];
		  }
		 return res;
		}
	}
public class Firsrreo2D {

	public static void main(String[] args) {
		FirstR o=new FirstR();
	    char a[][]= {{'a','b','c'},{'d','e','f'}};
	    char c[]=o.charA(a);
	    for(char k=0;k<=a.length;k++)
	    {
	    	System.out.println(c[k]);
	    }

	}

}





 
