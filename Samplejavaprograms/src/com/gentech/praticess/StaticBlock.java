package com.gentech.praticess;

public class StaticBlock {
	static int[] a;
	static int[]res;
	static 
	{
		 a = new int[]{1, 2, 3, 4};
        res = new int[a.length];
        {
        for (int i = a.length-1; i > 0; i--) 
        
            res[a.length - 1 - i] = a[i];
        }
	}
        
        public static int[] reverseArray()
        {
        	
        return res;
    }

    public static void main(String[] args) {
        Program14 o = new Program14();
        int[] c = o.reverseArray();
        for (int i = a.length; i >0; i--) 
        {
            System.out.println(i);
        }
    }
}

	