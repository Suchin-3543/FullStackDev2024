package com.gentech.opps.test;
class Outer 
{
    private Inner In = new Inner();

    private class Inner
    {
        String name;
        int age;
        void showinner()
        {
        	name="Suchin";
        	age=22;
        	System.out.println("Name: "+name);
        	System.out.println("Age: "+age);
        	
        }
  
     }
    void showouterinner()
    {
    	In.showinner();
    	
    }
}
    


public class Program5 {
    public static void main(String[] args) {
    	Outer o=new Outer();
    o.showouterinner();
    	
    }
}
	



	


