package com.infer.utils;

import java.util.*;

/**
 * The TermVector program implements an application that
 * gives the probability of a word being picked up, if randomly chosen.
 *
 * @author Anoop
 * @since 7/28/2015.
 */
public class TermVector {
    public String sentence;
    private static int totalWords;
    private int count;
    private static Map<String, Integer> wordFrequency = new LinkedHashMap<>();

    TermVector(String text, int countGiven) throws IllegalArgumentException {//Text is passed as constructor argument.
        StringChecks.checkEmptyAndNullConditions(text);
        sentence = text.toLowerCase();
        count = countGiven;
    }

    /**
     * This method Computes probability of occurrence of a certain word as
     * (number of times the word occurs / total number of words).
     *
     * @return :It returns the probability of occurrence of the
     * words or their combinations when randomly picked.
     **/
    public List<Double> getVector() {
        String[] breakInWords = sentence.split("\\s+");//splits the word on white space
        List<String> words = new ArrayList<>();
        Collections.addAll(words, breakInWords);
        int n = words.size();// number of words in the list.
        {
            int sIndex = 0;

            for (int j = sIndex; j < n; j++) {  // the loop will run a max of n times and minimum of 1 time for different inputs.

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
                    if (wordFrequency.containsKey(s)) {
                        int value = wordFrequency.get(s);
                        wordFrequency.put(s, value + 1);// increases the count of the word.
                    } else
                        wordFrequency.put(s, 1);
                }

                if (constString.length() == 0) // exit condition when we get single letter output. i.e. A,B,C,D
                    break;

            }

        }
        for (int f : wordFrequency.values()) {
            totalWords += f;
        }
        List<Double> probability = new ArrayList<>();
        for (String s : wordFrequency.keySet()) {
            Integer val = wordFrequency.get(s);
            double probabilityOfWord = (double) (val) / (double) (totalWords);
            probability.add(probabilityOfWord);
        }
        return probability;
    }

    /**
     * This method gives the probability of a word being picked up, if randomly chosen.
     *
     * @param term :This parameter has been used to give words as an input.
     * @return :It returns the probability of occurrence of a
     * word or a combination when randomly picked.
     **/
    public double getScore(String term) {
        StringChecks.checkEmptyAndNullConditions(term);
        term = term.toLowerCase();
        Integer value = wordFrequency.get(term);
        return (double) (value) / (double) (totalWords);
    }
}
