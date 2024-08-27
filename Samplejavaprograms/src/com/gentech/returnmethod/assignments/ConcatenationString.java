package com.gentech.returnmethod.assignments;
class Concate
{
    String returnString(String[] S)
    {
        String s="";
        //for( String k:S)
        for(int i=0;i<S.length;i++)
        {
        	s=s+S[i];
        }
        return s;
    }
}
public class ConcatenationString  {
    public static void main(String[] args) {
        String[] S = {"My","name","is","Suchin"};
        Concate o =new Concate();
        String ans = o.returnString(S);
        System.out.println("Concatenated  string:"+ans);
    }
}



        