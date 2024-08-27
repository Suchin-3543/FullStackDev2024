package com.gentech.polymorphism.assignments;
class Animal {
    void sound() 
    {
        System.out.println("This is an animal sound");
    }
}


class Dog extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal 
{
    @Override
    void sound() 
    {
        System.out.println("The cat meows");
    }
}

public class Polymorphism1 
{
    public static void main(String[] args) 
    {
        Animal myAnimal=null;
        
        myAnimal = new Dog(); 
        myAnimal.sound(); 
        
        myAnimal = new Cat();
        myAnimal.sound(); 
    }
}

