package com.infer.utils;

import java.util.*;

/**
 * Created by Anoop on 7/4/2015.
 */
public class CombinationOnCount {
    public static Map<String,Integer> getAllCombination(String sentence,int count) {
        String[] wordsa= sentence.split("\\s+");
        List<String> words = new ArrayList<>();
        Collections.addAll(words, wordsa);
        Map<String,Integer> result = new LinkedHashMap<>();
        int n = words.size();// number of words in the list.
        {  // the outer while loop will run 'n' number of times.

            int sIndex = 0;

            for (int j = sIndex; j < n; j++) {  // the inner loop will run a max of n times and minimum of 1 time for different inputs.

                if (j + count > n)  // exit condition.
                    break;

                int lengthOfConstantString = count - 1;
                int endOfConstantStringIndex = j + lengthOfConstantString;
                String constString = "";

                for (int k = j; k < endOfConstantStringIndex; k++) { // loop to find out the constant string
                    constString = constString + "" + words.get(k) + ",";

                }

                for (int l = endOfConstantStringIndex; l < n; l++) {  //we are appending variable string one by one to constant string and storing it in list
                    String s = constString + words.get(l);
                    if (result.containsKey(s)){
                        int value = result.get(s);
                        result.put(s,value+1);
                    }else
                        result.put(s,1);
                }

                if (constString.length() == 0) // exit condition when we get single letter output. i.e. A,B,C,D
                    break;

            }

        }
        return result;

    }}