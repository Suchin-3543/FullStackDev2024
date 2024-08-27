package com.gentech.praticess;

public class InstanceBlock1 {
	    int[] squares;

	    {
	    
	        squares = new int[10];
	        for (int i = 1; i <= 10; i++) {
	            squares[i - 1] = i * i;
	        }
	    }

	    public int[] getSquareNumbers() {
	        return squares;
	    }

	    public static void main(String[] args) 
	    {
	    	InstanceBlock1 o = new InstanceBlock1();
	        int[] res = o.getSquareNumbers();
	        for (int i = 0; i < res.length; i++) {
	            System.out.println(res[i] + " ");
	        }
	    }
	}

	