package com.gentech.practice.programs;
class Cbbb
{
	int[] cube3() {
        int res[] = new int[10];
        for(int i = 1; i <= 10; i++) {
            res[i - 1] = i * i * i;
        }
        return res;
	}
}

public class Cubeee3 {

	public static void main(String[] args) {
		 Cbbb o = new Cbbb();
	        int[] a = o.cube3();
	        for(int j = 0; j < a.length; j++)
	            System.out.println(a[j]);
		

	}

}
