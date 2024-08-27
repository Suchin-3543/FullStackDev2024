//Delete each occurrence of Day.

package com.gentech.string.assignments;

public class Program5 {
    public static void main(String[] args) {
        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length()-2; i++)
        {
            if(s.charAt(i) == 'D' && s.charAt(i+1) == 'A' && s.charAt(i+2) =='Y')
            {
                i+=2;
            }
            else s1.append(s.charAt(i));
        }
        System.out.println(s1);
    }
}