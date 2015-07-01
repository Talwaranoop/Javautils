package com.infer.utils.basics;

import java.util.Arrays;

/**
 * Created by Anoop on 6/30/2015.
 */
public class ArrayInt {
    public static void main (String[]args){
        int[] Height= new int[8];
        Height[0]=11;
        Height[1]=20;
        Height[2]=33;
        Height[3]=40;
        Height[4]=57;
        Height[5]=60;
     int add = 0;
        for (int aHeight : Height) {
            add = add + aHeight;
        }
        System.out.println("Sum is :"+add);
        Arrays.sort(Height);
        int i,j;
        for (i=0;i<Height.length;i++){
            System.out.println("Num :"+Height[i]);
            }
        for (j=0;j<Height.length;j++){
            if ((Height[j])%2 == 1) {
                System.out.println("odd number :" + Height[j]);
            }
        }
    }
}
