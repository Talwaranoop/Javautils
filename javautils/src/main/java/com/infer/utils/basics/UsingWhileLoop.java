package com.infer.utils.basics;

/**
 * Created by Anoop on 6/29/2015.
 */
public class UsingWhileLoop {

    public static void main(String[] args) {

        int loopVal = 0;

        while (loopVal < 10) {
            loopVal = loopVal+1;
            System.out.println(loopVal);
            loopVal++;
        }
    }
}