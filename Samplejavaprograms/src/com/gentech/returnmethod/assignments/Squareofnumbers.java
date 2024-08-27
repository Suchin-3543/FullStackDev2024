package com.gentech.returnmethod.assignments;
class Square
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

public class Squareofnumbers{
    public static void main(String[] args) {
        Square s = new Square();
        int[] res = s.getSquare();
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]+" ");
        }
    }
}


