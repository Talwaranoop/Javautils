package com.infer.utils;

import java.util.*;

/**
 * The WordFrequency program implements an application that
 * iterates over the sentences given as input  and count the
 * frequency of EntityDictionary words.
 *
 * @author Anoop
 * @since 6/19/2015.
 */
public class WordFrequency {
    public Collection<String> diction = new HashSet<>();

    public WordFrequency(EntityDictionary dict) throws IllegalArgumentException {//object of EntityDictionary class passed as constructor argument.
        if (dict == null)
            throw new IllegalArgumentException("The Dictionary cannot be null!");
        if (dict.contains(""))
            throw new IllegalArgumentException("Dictionary cannot be empty");
        diction = dict.getWords();//copies all the words present in the EntityDictionary set to the diction set.
    }

    /**
     * This method adds the Sentence to the Dictionary.
     *
     * @param sentence : This parameter has been used to
     *                 getWordFrequency Sentence to the Dictionary.
     */

        /* A function will be written to make the combinations of the words and will be put in the map*/
    public Map<String, Integer> getWordFrequency(String sentence) throws IllegalArgumentException {
        if (sentence == null)
            throw new IllegalArgumentException("The string cannot be null!");
        if (sentence.isEmpty())
            throw new IllegalArgumentException("String cannot be empty");
        String[] words = sentence.split("\\s+"); // Splits the line on White Space.
        Map<String, Integer> wordToCount = new HashMap<>();

        for (String word : words) {
            if (!diction.contains(word)) {
                continue;
            }
            if (wordToCount.containsKey(word)) {
                Integer val = wordToCount.get(word);
                wordToCount.put(word, val + 1);// increases the count value of the word.
            } else {
                wordToCount.put(word, 1);
            }
        }

            for (int i=0;i<words.length-1;i++) {// "i" is the index of the words array.
                if (!diction.contains(words[i]+""+" "+words[i+1])) {
                    continue;
                }
                if (wordToCount.containsKey(words[i]+""+" "+words[i+1])) {
                    Integer val2 = wordToCount.get(words[i]+""+" "+words[i+1]);
                    wordToCount.put(words[i]+""+" "+words[i+1], val2 + 1);
                }else {
                    wordToCount.put(words[i]+""+" "+words[i+1],1);
                }
            }
        List<String> Combinations ;
        Combinations = Strings.getAllCombination(wordToCount.keySet());//gets the combinations of dictionary words present in the sentence.
        for (String s : Combinations) {
            wordToCount.put(s, 1);
        }
        return wordToCount;
    }

    public Map<String, Integer> getGlobalWordFrequency(Collection<String> sentences) {
        Map<String, Integer> FinalMap;
        Map<String, Integer> finalCount = new HashMap<>();
        for (String sentence : sentences) {
            FinalMap = getWordFrequency(sentence);
            for (String s : FinalMap.keySet()) {
                if (finalCount.containsKey(s)) {
                    Integer val = finalCount.get(s);
                    finalCount.put(s, val + 1);// increases the count value of the word.
                } else {
                    finalCount.put(s, 1);
                }
            }
        }
        return finalCount;
    }
}