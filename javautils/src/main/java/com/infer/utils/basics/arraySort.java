package com.infer.utils.basics;

import java.util.Arrays;

/**
 * Created by Anoop on 6/30/2015.
 */
public class ArraySort {
    public static void main (String[]args){
        int[]Array=new int[4];
        Array[0]=4;
        Array[1]=1;
        Array[2]=6;
        Array[3]=2;
        Arrays.sort(Array);
        int i;
        for (i=0;i<Array.length;i++){
            System.out.println("num :"+Array[i]);

        }
    }
}
