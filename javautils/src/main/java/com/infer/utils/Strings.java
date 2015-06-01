package com.infer.utils;

import java.io.*;

/**
 * Created by Anoop on 5/22/2015.
 */
public class Strings {

    //convert a string to lower case
    public static String toLowerCase(String s, int start, int len){
        char[] charArray = s.toCharArray();
        for(int i= start; i< start+len;i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
    //convert a string to upper case
    public static String toUpperCase (String s, int start, int len){
        char[] charArray = s.toCharArray();
        for(int i= start; i< start+len;i++){
            if(Character.isLowerCase(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String (charArray);
    }
    //convert a string to lower case using Byte
    public static void toLowerCase(byte s[], int start, int len) {
        String a;
        a = new String(s);
        char[] charArray = a.toCharArray();
        for (int i = start; i < start + len; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        System.out.println("Output of the program: " + new String(charArray));
    }
    //convert a string to upper case using Byte
    public static void toUpperCase(byte s[], int start, int len) {
        String a;
        a = new String(s);
        char[] charArray = a.toCharArray();
        for (int i = start; i < start + len; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println("Output of the program: "+new String(charArray));
    }
    public static void main(String[]args)throws IOException{
        BufferedReader objName= new BufferedReader(new InputStreamReader(System.in));
        String sLow,sLow1,sUp, sUp1;
        int start,len,start1,len1,start2,len2,start3,len3;
        String lowerOutput;
        String upperOutput;
        byte    str[],str1[];

        /*Lower case program starts here*/

        System.out.println("Enter the String");
        sLow = objName.readLine();
        System.out.println("Enter the starting point to lowercase");
        start=Integer.parseInt(objName.readLine());
        System.out.println("Enter the length to be lowercased");
        len=Integer.parseInt(objName.readLine());
        lowerOutput= toLowerCase(sLow, start, len);
        System.out.println("Output of the program: "+lowerOutput);

        /*Lower case program ends here*/

        /*Upper case program starts here*/

        System.out.println("Enter the String");
        sUp = objName.readLine();
        System.out.println("Enter the starting point to uppercase");
        start1=Integer.parseInt(objName.readLine());
        System.out.println("Enter the length to be uppercased");
        len1=Integer.parseInt(objName.readLine());
        upperOutput= toUpperCase(sUp, start1, len1);
        System.out.println("Output of the program: "+upperOutput);

        /*Upper case program ends here*/

        /*Lower case program for Byte starts here */

        System.out.println("Enter the String");
        sLow1 = objName.readLine();
        str1 =   sLow1.getBytes();
        System.out.println("Enter the starting point to lowercase");
        start3=Integer.parseInt(objName.readLine());
        System.out.println("Enter the length to be lowercased");
        len3=Integer.parseInt(objName.readLine());
        toLowerCase(str1, start3, len3);
        //System.out.println("Output of the program: "+lowerOutput);

        /*Lower case program for Byte ends here*/

        /*Upper case program for Byte starts here*/

        System.out.println("Enter the String");
        sUp1 = objName.readLine();
        str =   sUp1.getBytes();
        System.out.println("Enter the starting point to uppercase");
        start2=Integer.parseInt(objName.readLine());
        System.out.println("Enter the length to be uppercased");
        len2= Integer.parseInt(objName.readLine());
        toUpperCase(str, start2, len2);
        //System.out.println("Output of the program: "+upperOutput);

        /*Upper case program for Byte ends here*/
    }

}
