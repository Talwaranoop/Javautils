package com.infer.utils;

import java.io.*;

/**
 * Created by Anoop on 5/22/2015.
 */
public class Strings {

    //convert a string to lower case
    public static String toLowerCase(String s, int start, int len) {
        char[] charArray = s.toCharArray();
        for (int i = start; i < start + len; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return new String(charArray);
    }

    //convert a string to upper case
    public static String toUpperCase(String s, int start, int len) {
        char[] charArray = s.toCharArray();
        for (int i = start; i < start + len; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }

    //convert a string to lower case using Byte
    public static void toLowerCase(byte[] byteStream,int start, int len){
        try {
            for(int i = start; i < start + len;i++){
                if(byteStream[i] >= 65 && byteStream[i] <= 90){
                    byteStream[i] = (byte) (byteStream[i] + 32);
                }
            }
            System.out.println(new String(byteStream));
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    //convert a string to upper case using Byte
    public static void toUpperCase(byte[] byteStream,int start, int len){
        try {
            for(int i = start; i < start + len;i++){
                if(byteStream[i] >= 97 && byteStream[i] <= 122){
                    byteStream[i] = (byte) (byteStream[i] - 32);
                }
            }
            System.out.println(new String(byteStream));
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
    }
