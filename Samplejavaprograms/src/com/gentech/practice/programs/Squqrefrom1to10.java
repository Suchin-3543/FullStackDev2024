package com.gentech.practice.programs;

class Sqaure
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
public class Squqrefrom1to10 {

	public static void main(String[] args) {
		Sqaure s = new Sqaure();
		int[] res = s.getSquare();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}


