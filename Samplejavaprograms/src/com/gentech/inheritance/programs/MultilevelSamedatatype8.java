package com.gentech.inheritance.programs;
class Students 
{
    String bookName;
    Students(String bookName)
    {
	    System.out.println("Book Name in Student class :"+bookName);	
     }

}
class Library2 extends Students 
{
    String bookName;
    Library2(String name)
    {
	super(name);
    super.bookName=name;
    }
void display()
{
    System.out.println("book Name in Library class :"+bookName);
   }
}
class Bookshelf extends Library2
{
    String bookName;
    Bookshelf(String name)
    {
    super(name);
    super.bookName = name;
}
void displayBook() 
{
    System.out.println("book Name in Bookshelf class :"+bookName);
   }
}
public class MultilevelSamedatatype8 {

	public static void main(String[] args) 
	{
		Bookshelf o = new Bookshelf("Python");
		o.bookName="SpringBot";
		o.display();
		o.displayBook();

	}

}

		
		

