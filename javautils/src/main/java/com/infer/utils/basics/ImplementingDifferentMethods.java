package com.infer.utils.basics;

/**
 * Created by Anoop on 7/1/2015.
 */
public class ImplementingDifferentMethods {
    public static void main(String[]args){
        String Test = " I Will Rise Again  ";
        char get = Test.charAt(7);
        System.out.println(get);
        String WillReplace = Test.replace("Again","Always");
        System.out.println(WillReplace);
        String Space = Test.trim();
        System.out.println(Space);

    }
}
