package com.infer.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anoop on 7/6/2015.
 */
public class Combination {

    public static List<String> getAllCombination(List<String> words){

    Collections.sort(words);

    List<String> result = new ArrayList<String>();
    int n = words.size();
    int count = 2;

    while(count <= n){                  // the outer while loop will run 'n' number of times.

        int sIndex = 0;

        for(int j=0;j<n;j++){       // the inner loop will run a max of n times and minimum of 1 time for different inputs.

            if(j+count > n)                 // exit condition.
                break;

            int lengthOfConstantString = count-1;
            int endOfConstantStringIndex = j +lengthOfConstantString;
            String constString="";

            for(int k = j; k< endOfConstantStringIndex; k++){               // loop to find out the constant string
                constString += words.get(k)+",";

            }

            for(int l = endOfConstantStringIndex; l <n;l++){  //we are appending variable string one by one to constant string and storing it in list
                String s = constString + words.get(l);
                result.add(s);
                System.out.println(s);
            }

            if(constString.length() ==0)                               // exit condition when we get single letter output. i.e. A,B,C,D
                break;

        }

        count++;
    }
    return result;

}

    public static void main(String ... args){

        List<String> words = new ArrayList<String>();
        words.add("Ayesha");
        words.add("Amit");
        words.add("Anoop");

        List<String> listOfCombinations = getAllCombination(words);
    }
}
