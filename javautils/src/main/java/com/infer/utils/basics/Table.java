package com.infer.utils.basics;

import java.util.Scanner;

/**
 * Created by Anoop on 6/29/2015.
 */
public class Table {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        String input;
        System.out.println("Enter which table to be written");
        input = obj.next();
        int b =Integer.parseInt(input);
        int a;
        int c;
        System.out.println("The table is: ");
        for (a = 1;a<=10;a++){
            c = a*b;
            System.out.println(a+" times "+b+" = "+c);
        }

    }
}
