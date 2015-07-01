package com.infer.utils.basics;

import java.util.ArrayList;

/**
 * Created by Anoop on 6/30/2015.
 */
public class ListInArray {
    public static void main(String[] args) {
        ArrayList<java.io.Serializable> Test = new ArrayList<java.io.Serializable>();
        Test.add("anoop");
        Test.add("amit");
        Test.add(3);
        Test.add(4);
        for (Object aTest : Test) {
            System.out.println(aTest);
        }
        Test.remove(2);
        System.out.println("List after removal of element :"+Test);
        System.out.println("position 1 = "+Test.get(1));
    }
}
