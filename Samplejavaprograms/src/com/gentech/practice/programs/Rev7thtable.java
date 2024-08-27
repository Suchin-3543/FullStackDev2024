package com.gentech.practice.programs;

class Table7 {
    int[] getReverseTab() {
        int res[] = new int[10];
        for (int i = 10; i>=1; i--) {
            res[10-i] = 7 * i;
        }
        return res;
    }
}

public class Rev7thtable {
    public static void main(String[] args) {
        Table7 t = new Table7();
        int c[] = t.getReverseTab();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i] + " ");
        }
    }
}



    

