package com.gentech.returnmethod.assignments;
class Table7 {
    int[] getReverseTab() {
        int res[] = new int[10];
        for (int i = 10; i>=1; i--) {
            res[10-i] = 7 * i;
        }
        return res;
    }
}

public class Reverse7table{
    public static void main(String[] args) {
        Table7 t = new Table7();
        int c[] = t.getReverseTab();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

