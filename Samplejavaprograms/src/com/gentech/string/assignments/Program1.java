//Without using length method, find no.of char in given string.


package com.gentech.string.assignments;

public class Program1 {

	public static void main(String[] args) {
		String s = "Java Programming";
		int count = 0;
		for (char c : s.toCharArray()) 
		{
		   count++;
		 }
		     System.out.println("Length of the string is: " + count);
		  }
		

	}


