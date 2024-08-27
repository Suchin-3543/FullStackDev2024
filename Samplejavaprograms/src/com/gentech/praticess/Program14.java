package com.gentech.praticess;

public class Program14 
{
    static int[] a = {1, 2, 3, 4, 5}; 

    public int[] reverseArray() 
    {
        int[] res = new int[a.length];
        for (int i = a.length - 1; i > 0; i--) 
        {
            res[a.length - 1 - i] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Program14 o = new Program14();
        int[] c = o.reverseArray();
        for (int i = a.length - 1; i > 0; i--) 
        {
            System.out.println(i);
        }
    }
}
