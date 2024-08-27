package com.gentech.Abstarctclass.programs;
abstract class Math1 {
    {
        System.out.println("Arithmetic Operation");
    }

    abstract int square();
}

class Square extends Math1 {
    private int num;

    
    Square(int num) 
    {
        this.num = num;
    }

    int square() 
    {
        return num * num;
    }
}

public class AbstractMethodreturnvalue4 {
    public static void main(String[] args) {
        Square square = new Square(7);
        System.out.println("Square of the number: " + square.square());
    }
}


