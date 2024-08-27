package com.gentech.practice.programs;
class Array
{
	Array(int arr[])
	{
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class ArrayConstractor {

	public static void main(String[] args) {
		int b[]= {12,78,90,67,45};
		Array o1=new Array(b);

	}

}
