package com.gentech.opps.test;
interface A 
{
 void display();
}

interface B 
{
 void display();
}

class C implements A, B 
{
 int value;

C(int value) 
{
     this.value = value;
     System.out.println("Constructor of superclass C with value: " + value);
 }


 @Override
 public void display() 
 {
     System.out.println("Value in superclass C: " + value);
 }
}


class D extends C 
{
 

 D(int value) {
     super(value); 
     System.out.println("Value in superclass D:" + value);
 }
 
 
 @Override
 public void display() 
 {
     System.out.println("Value in subclass D:" + value);
 }


}


public class Program6 {
 public static void main(String[] args) {
     
     D obj = new D(10);
     
     obj.display();
 }
}


