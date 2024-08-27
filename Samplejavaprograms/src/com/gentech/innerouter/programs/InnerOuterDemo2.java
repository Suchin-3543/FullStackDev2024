//write a program for nested class in which inner class is static execute the members of inner class in outer class.

package com.gentech.innerouter.programs;
class Outer1{
    Inner1 In = new Inner1();

    static class Inner1 {
        int id;
        String name;
        int age;
        void showinner()
        {
        	id=229;
        	name="Suchin";
        	int age=22;
            System.out.println("Id: "+id);
        	System.out.println("Name: "+name);
        	System.out.println("Age:"+age);
        	
        	
        }
   
        }
    void showouterinner()
    {
    	In.showinner();
    	
    	
    	
    }
}
    

public class InnerOuterDemo2 {

	public static void main(String[] args) {
		Outer1 o=new Outer1();
		o.showouterinner();

	}

}


