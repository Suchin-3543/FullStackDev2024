/*
P
P R
P R O
P R O G
P R O G R
P R O G R A
P R O G R A M*/

package com.gentech.string.assignments;
public class Program7 {
	    public static void main(String[] args) {
	        String str = "PROGRAM";
	        for (int i = 1; i <= str.length(); i++) 
	        {
	            for (int j = 0; j < i; j++) 
	            {
	                System.out.print(str.charAt(j) + " ");
	            }
	            System.out.println();
	        }
	    }
	}
