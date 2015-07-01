package com.infer.utils.basics;

/**
 * Created by Anoop on 6/29/2015.
 */
public class UsingForLoop {
public static void main(String[]args) {
    int[] Life = new int[58];
   int i;
    for (i=0;i < Life.length;i++){
        Life[i] = i+1;
        System.out.println(Life[i]);
    }
    }

}
