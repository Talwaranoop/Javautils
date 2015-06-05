package com.infer.utils;

import java.io.*;

/**
 * The Strings program implements an application that
 * simply converts a string to uppercase or lowercase
 * by using different methods.
 *
 * @author Anoop
 * @since 5/22/2015.
 */
public class Strings {

    /**
     * This method converts a string to Lower Case.
     *
     * @param s     This is the first parameter and is used to input a string.
     * @param start This parameter has been used to declare the starting point
     *              from which the string will be LowerCased.
     * @param len   This parameter has been used to declare the length up to
     *              which the string will be LowerCased.
     * @return This returns the converted LowerCased string.
     */
    public static String toLowerCase(String s, int start, int len) {
        char[] charArray = s.toCharArray();//Stores sting in array
        for (int i = start; i < start + len; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return new String(charArray);
    }

    /**
     * This method converts a string to upper case.
     *
     * @param s     This is the first parameter and is used to input a string.
     * @param start This parameter has been used to declare the starting point
     *              from which the string will be UpperCased.
     * @param len   This parameter has been used to declare the length up to
     *              which the string will be UpperCased.
     * @return This returns the converted UpperCased string.
     */
    public static String toUpperCase(String s, int start, int len) {
        char[] charArray = s.toCharArray();
        for (int i = start; i < start + len; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }

    /**
     * This method converts a string to lower case using Byte.
     *
     * @param byteStream This para
     * @param start      This parameter has been used to declare the starting point
     *                   from which the string will be LowerCased.
     * @param len        This parameter has been used to declare the length up to
     *                   which the string will be LowerCased.
     */
    public static void toLowerCase(byte[] byteStream, int start, int len) {
        try {
            for (int i = start; i < start + len; i++) {
                if (byteStream[i] >= 65 && byteStream[i] <= 90) {
                    byteStream[i] = (byte) (byteStream[i] + 32);
                    /**
                     *65 & 90 are ascii codes of byte representing uppercase
                     *  alphabets A & Z respectively.
                     *Where as the '32' also known as Delta is the difference between
                     * an uppercase and a lower case alphabet.
                     */
                }
            }
            System.out.println(new String(byteStream));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    //convert a string to upper case using Byte
    public static void toUpperCase(byte[] byteStream, int start, int len) {
        try {
            for (int i = start; i < start + len; i++) {
                if (byteStream[i] >= 97 && byteStream[i] <= 122) {
                    byteStream[i] = (byte) (byteStream[i] - 32);
                    /**97 & 122 are ascii codes of byte representing characters lowercase
                     * letters a & z respectively.
                     * Where as the '32' also known as Delta is the difference between
                     * an uppercase and a lower case letter.
                     */
                }
            }
            System.out.println(new String(byteStream));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
