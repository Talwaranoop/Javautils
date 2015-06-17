package com.infer.utils;
import java.util.HashSet;
/**
 * Created by Anoop on 6/17/2015.
 */
public class exampleagain {
    public static void main(String a[]) {
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("pig");
        hs.add("animal");
        hs.add("large");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
           }
    }




