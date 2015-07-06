package com.infer.utils;

import java.util.ArrayList;

/**
 * Created by Anoop on 7/4/2015.
 */
public class prac {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("one");
        arr.add("two");
        arr.add("three");

        ArrayList<String> str = combine(arr);
        System.out.println(str);
    }

    static ArrayList<String> combine(ArrayList<String> arr) {
        ArrayList<String> retArr = new ArrayList<String>();
        if (arr.size() == 0) {
            retArr.add("");
            return retArr;
        }
        ArrayList<String> tmpArr = (ArrayList<String>) arr.clone();
        tmpArr.remove(0);

        System.out.println(tmpArr);
        for (String s : tmpArr) {
            for (String s1 : arr) {
                retArr.add(s + "" + s1);


            }
        }
        return (retArr);
    }
}