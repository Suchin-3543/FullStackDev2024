package com.gentech.opps.test;
class Animal 
{
public void sound() 
{
     System.out.println("The animal makes a sound");
  }
}


class Dog extends Animal 
{
 
 @Override
 public void sound() 
 {
     System.out.println("The dog barks");
   }
}


class Cat extends Animal 
{
 
 @Override
 public void sound() 
 {
     System.out.println("The cat meows");
    }
}


public class Program10 {
 public static void main(String[] args) {
    
     Animal myDog=new Dog();
     myDog.sound(); 
     Animal myCat=new Cat(); 
     myCat.sound();  
     Animal myAnimal=new Animal();
     myAnimal.sound();
    
   }
}


