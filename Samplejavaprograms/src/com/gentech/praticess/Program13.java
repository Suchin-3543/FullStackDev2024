package com.gentech.praticess;
class Squarerr
{
    int[] getSquare()
    {
        int[] sq = new int[10];
        for (int i=1; i<=10; i++)
        {
            sq[i-1] = i * i;
        }
        return sq;
    }
}


public class Program13 {

	public static void main(String[] args) {
		Squarerr o=new Squarerr();
		int c[]=o.getSquare();
		for (int i = 0; i < c.length; i++)
		System.out.println(c[i]);
		

	}

}
