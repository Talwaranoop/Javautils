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
    public int totalWords;
    private Map<String, Integer> wordFrequency = new LinkedHashMap<>();

    TermVector(String text) throws IllegalArgumentException {
        if (text == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        sentence = text;
        sentence = sentence.toLowerCase();
    }

    public void countWordFrequency() {
        String[] words = sentence.split("\\s+");
        totalWords = words.length;
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                Integer value = wordFrequency.get(word);
                wordFrequency.put(word, value + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

    }

    public List<Double> getVector() {
        List<Double> probability = new ArrayList<>();
        for (String s : wordFrequency.keySet()) {
            Integer value = wordFrequency.get(s);
            double var = (double) (value) / (double) (totalWords);
            probability.add(var);
        }
        return probability;
    }

    public double getScore(String term) {
        term = term.toLowerCase();
        Integer value = wordFrequency.get(term);
        return (double) (value) / (double) (totalWords);
    }
}
