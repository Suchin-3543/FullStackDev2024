//Without using replace replace the old string with new string.


package com.gentech.string.assignments;

public class Program3 {
    public static void main(String[] args) {
        String s = "String Buffer is a mutable";
        String[] arr = s.split(" ");
        String Old = "Buffer";
        String New = "Builder";

        for (int i = 0; i < arr.length; i++) 
        {
            if(arr[i].equals(Old))
            {
                arr[i] = New;
            }
        }
        String result = String.join(" ", arr);
        System.out.println(result);
    }
}
