package com.infer.utils;

import java.util.HashSet;

/**
 * Created by Anoop on 6/17/2015.
 */
public class example {
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> hset =
                new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fruits");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

        //Displaying HashSet elements
        System.out.println(hset);
    }
}