package com.infer.utils;

import java.util.*;
import java.util.List;

/**
 * The WordFrequency program implements an application that
 * iterates over the sentences given as input  and count the
 * frequency of EntityDictionary words.
 *
 * @author Anoop
 * @since 6/19/2015.
 */
public class WordFrequency {
    private Collection<String> dictionaryWords = new HashSet<>();

    public WordFrequency(EntityDictionary entityDictionaryWords) throws IllegalArgumentException {//object of EntityDictionary class passed as constructor argument.
        if (entityDictionaryWords == null)
            throw new IllegalArgumentException("The Dictionary cannot be null!");
        dictionaryWords = entityDictionaryWords.getWords();//copies all the words present in the EntityDictionary set to the dictionaryWords set.
    }

    /**
     * This method iterates over the sentences given as input
     * and counts the frequency of Dictionary words and puts
     * it in the map.
     *
     * @param sentence : This parameter has been used to give sentence as an input.
     */
    public Map<String, Integer> getWordFrequency(String sentence) throws IllegalArgumentException {
        if (sentence == null)
            throw new IllegalArgumentException("The string cannot be null!");
        if (sentence.isEmpty())
            throw new IllegalArgumentException("String cannot be empty");
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("\\s+"); // Splits the line on White Space.
        Map<String, Integer> wordToCount = new HashMap<>();
        String[] storeDuplicateWords;
        storeDuplicateWords = words.clone();
        String[] checkFinalWord = words.clone();
        for (int i = 0; i < words.length; i++) {// "i" is the index of the words array.
            if (dictionaryWords.contains(words[i])) {
                checkFinalWord[i] = words[i];
                int k = i + 1;
                while (k < storeDuplicateWords.length) {
                    storeDuplicateWords[i] = storeDuplicateWords[i] + " " + storeDuplicateWords[k];
                    if (dictionaryWords.contains(storeDuplicateWords[i])) {
                        checkFinalWord[i] = storeDuplicateWords[i];
                        k++;

                    } else
                        k++;

                }
                if (wordToCount.containsKey(checkFinalWord[i])) {
                    Integer value1 = wordToCount.get(checkFinalWord[i]);
                    wordToCount.put(checkFinalWord[i], value1 + 1);// increases the count of the word.
                } else {
                    wordToCount.put(checkFinalWord[i], 1);
                }
            }
        }

        List<String> Combinations;
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