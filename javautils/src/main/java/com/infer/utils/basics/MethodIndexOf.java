package com.infer.utils.basics;

/**
 * Created by Anoop on 6/30/2015.
 */
public class MethodIndexOf {
    public static void main(String[] args) {
        char ampersand = '@';
        String DotCom = ".com";
        String EmailAddress = "anoop455@gmail.com";
        int result = EmailAddress.indexOf(ampersand);
        int check = EmailAddress.indexOf(DotCom, result);
        if (result != -1) {
            if (check == -1) {
                System.out.println("Invalid Email Address");
            } else {
                System.out.println("Valid Email Address");
            }
        }
    }
}