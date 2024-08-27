package com.gentech.returnmethod.assignments;
class Tables
{
    int[] mathTable(int num)
    {
        int a[]=new int[11];
        for(int i=0;i<=10;i++)
        {
           a[i]=i*num;
        }
        return a;
    }
}
public class Completemaths {
    public static void main(String[] args) {
        Tables t=new Tables();
        int c[]=t.mathTable(50);
        for (int i=1;i<c.length;i++)
        {
            System.out.println("50*"+i+"="+c[i]);
        }

    }
}


