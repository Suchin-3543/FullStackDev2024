// write a nested class in which inner class is private and execute outer and inner class members.
package com.gentech.innerouter.programs;
class Outer {
    private Inner In = new Inner();

    private class Inner {
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
    


public class InnerOuterDemo1 {
    public static void main(String[] args) {
    	Outer o=new Outer();
    o.showouterinner();
    	
    }
}
	



	