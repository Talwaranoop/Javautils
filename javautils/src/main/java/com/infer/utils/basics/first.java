package com.infer.utils.basics;

/**
 * Created by Anoop on 6/27/2015.
 */
public class first {
    public static void main(String[]agrs) {
        int addition = 0;
       int loopValue = 1;
        int endValue = 101;
            for (loopValue = 0; loopValue < endValue; loopValue++) {
                addition = addition + loopValue;
            }
        System.out.println("Total = "+addition);
        }
    }