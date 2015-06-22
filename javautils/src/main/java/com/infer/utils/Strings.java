package com.infer.utils;
/**
 * The Strings program implements an application that
 * simply converts a string to uppercase or lowercase
 * by using different methods.
 *
 * @author Anoop
 * @since 5/22/2015.
 */
public class Strings {
    private static Strings common = new Strings( );
    /* A private Constructor prevents any other
    * class from instantiating.
    */
    private Strings(){ }
    private static final int DELTA = 32;//DELTA is the difference between the ASCII codes of UpperCase and LowerCase alphabet.

    public static Strings getInstance(){
        if(common == null){
            common = new Strings();
        }
        return common;
    }
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

    public static String toLowerCase(String s, int start, int len) throws IllegalArgumentException {

        if(s == null)
            throw new IllegalArgumentException("The string cannot be null!");
        if (s.matches(".*[^ A-Za-z0-9].*"))//Regular expression for matching special characters.
            throw new IllegalArgumentException("String cannot contain special characters");
        char[] charArray = s.toCharArray();//Stores sting in array
        if (start<0)
            throw new IllegalArgumentException("The argument " + start+ "cannot be negative");
        if (len < 0)
            throw new IllegalArgumentException("The argument " + len + "cannot be negative");
        if (s.isEmpty())
            throw new IllegalArgumentException("String cannot be empty");
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
    public static String toUpperCase(String s, int start, int len) throws IllegalArgumentException {
        if(s == null)
            throw new IllegalArgumentException("The string cannot be null!");
        char[] charArray = s.toCharArray();
        if (start<0)
            throw new IllegalArgumentException("The argument " + start+ "cannot be negative");
        if (len <= 0)
            throw new IllegalArgumentException("The argument " +len + "cannot be zero or negative");
        if (s.isEmpty())
            throw new IllegalArgumentException("String cannot be empty");
        for (int i = start; i < start + len; i++) {
                if (Character.isLowerCase(charArray[i])) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                }
            }
        return new String(charArray);
    }

    /**
     * This method converts a string to lower case using byte.
     *
     * @param byteStream This is the first parameter and is used to input a string through byte.
     * @param start      This parameter has been used to declare the starting point
     *                   from which the string will be LowerCased.
     * @param len        This parameter has been used to declare the length up to
     *                   which the string will be LowerCased.
     */
    public static void toByteLowerCase(byte[] byteStream, int start, int len) throws IllegalArgumentException {
        try {
            if (byteStream == null)
                throw new IllegalArgumentException("The byte cannot be null!");
            if (start < 0)
                throw new IllegalArgumentException("The argument " + start + "cannot be negative");
            if (len <= 0)
                throw new IllegalArgumentException("The argument " + len + "cannot be zero or negative");
            for (int i = start; i < start + len; i++) {
                if (byteStream[i] >= 65 && byteStream[i] <= 90) {
                    byteStream[i] = (byte) (byteStream[i] + DELTA);
                    /**
                     *65 & 90 are ascii codes of byte representing uppercase
                     *  alphabets A & Z respectively.
                     *Where as the '32' is the difference between
                     * an uppercase and a lower case alphabet.
                     */

                }
            }
            System.out.println(new String(byteStream));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    /**
     * This method converts a string to upper case using byte.
     *
     * @param byteStream This is the first parameter and is used to input a string through byte.
     * @param start      This parameter has been used to declare the starting point
     *                   from which the string will be UpperCased.
     * @param len        This parameter has been used to declare the length up to
     *                   which the string will be UpperCased.
     */
    public static void toByteUpperCase(byte[] byteStream, int start, int len) throws IllegalArgumentException {
        try {
            if(byteStream == null)
                throw new IllegalArgumentException("The byte cannot be null!");
            if (start<0)
                throw new IllegalArgumentException("The argument " + start+ "cannot be negative");
            if (len <= 0)
                throw new IllegalArgumentException("The argument " + len + "cannot be zero or negative");
            for (int i = start; i < start + len; i++) {
                if (byteStream[i] >= 97 && byteStream[i] <= 122) {
                    byteStream[i] = (byte) (byteStream[i] - DELTA);
                    /**97 & 122 are ascii codes of byte representing lowercase
                     * alphabets a & z respectively.
                     * Where as the '32' is the difference between
                     * an uppercase and a lower case letter.
                     */

                }
            }
            /**IndexOutOfBoundException is thrown when the entered value exceeds the last index of the array
             */
            System.out.println(new String(byteStream));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
