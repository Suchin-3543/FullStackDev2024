//Without using reverse method reverse the string.


package com.gentech.string.assignments;

public class Program2 {

	public static void main(String[] args) {
		  String s = "Suchin";
		  StringBuilder stringBuilder = new StringBuilder(s);
		  for (int i = 0; i < stringBuilder.length()/2; i++) 
		  {
		  char temp = stringBuilder.charAt(i);
	      stringBuilder.setCharAt(i, stringBuilder.charAt(stringBuilder.length()-1-i));
		  stringBuilder.setCharAt(stringBuilder.length()-1-i, temp);
		  }
		  
		  System.out.println(stringBuilder);
	}
}

	


