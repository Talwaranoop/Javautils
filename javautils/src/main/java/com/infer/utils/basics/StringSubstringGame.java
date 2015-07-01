package com.infer.utils.basics;

import java.util.Scanner;

/**
 * Created by Anoop on 7/1/2015.
 */
public class StringSubstringGame {
    public static void main(String[]args){
        String Name;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        Name = obj.nextLine();
        String FirstName = Name.substring(0,2);
        int SpacePos = Name.indexOf(" ");
        String SurNameCopy = Name.substring(SpacePos+1,SpacePos+3);
        String FirstNameOtherChars = Name.substring(2,5);
        String SurNameOtherChars = Name.substring(SpacePos+3,Name.length());
        String GameName= SurNameCopy+FirstNameOtherChars+ " "+FirstName+SurNameOtherChars;
        System.out.println("The Output Of Your Name Is : "+GameName);
    }
}
