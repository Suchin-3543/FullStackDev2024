//Verify the given string is Palindrome.

package com.gentech.string.assignments;
public class Program6 {
    public static void main(String[] args) {
        String s = "GADAG";
        boolean flag = true;
        for (int i = 0; i <= s.length() / 2; i++) 
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("Palindrome ");
        }
        else 
        {
            System.out.println("Not a Palindrome String");
        }
    }
}


