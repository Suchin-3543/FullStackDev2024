// SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY insert , after each occurrence of Day.

package com.gentech.string.assignments;

public class Program4 {
    public static void main(String[] args) {
        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        StringBuffer s1 = new StringBuffer(s);
        for (int i = 0; i < s1.length(); i++) 
        {
            if(s1.charAt(i) == 'Y')
            {
                s1.insert(i+1,", ");
                i +=2;
            }
        }
        System.out.println(s1);
    }
}