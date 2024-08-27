package com.gentech.praticess;
public class StaticBlock2 
{
    static int[] squares;

    static {
        squares = new int[10];
        for (int i = 1; i <= 10; i++) {
            squares[i - 1] = i * i;
        }
    }

    public static int[] getSquareNumbers() 
    {
        return squares;
    }

    public static void main(String[] args) 
    {
    	StaticBlock2  o=new StaticBlock2 ();
    	int[] res = o.getSquareNumbers();
        for (int i = 0; i < res.length; i++) 
        {
            System.out.println(res[i]+" ");
    }
    }
   }