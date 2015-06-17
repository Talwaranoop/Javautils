package com.infer.utils;
import java.util.HashSet;
/**
 * Created by Anoop on 6/17/2015.
 */
public class examples {
    public static void main(String a[]){
    HashSet<String> hs = new HashSet<String>();
    //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("HashSet content: ");
        System.out.println(hs);
        String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
                System.out.println(str);
            }
        }
    }
