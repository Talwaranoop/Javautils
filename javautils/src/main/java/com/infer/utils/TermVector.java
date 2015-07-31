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
    private int totalWords;
    private Map<String, Integer> wordFrequency = new LinkedHashMap<>();

    TermVector(String text) throws IllegalArgumentException {//Text is passed as constructor argument.
        StringChecks.checkEmptyAndNullConditions(text);
        sentence = text.toLowerCase();
    }

    /**
     * This method Computes probability of occurrence of a certain word as
     * (number of times the word occurs / total number of words).
     *
     * @return :This is used to return probability of the occurrence of all the words in the sentence.
     **/
    public List<Double> getVector() {
        wordFrequency = Strings.countWordFrequency(sentence);
        totalWords = Strings.countNumberOfWordsInSentence(sentence);
        List<Double> probability = new ArrayList<>();
        for (String s : wordFrequency.keySet()) {
            Integer value = wordFrequency.get(s);
            double probabilityOfWord = (double) (value) / (double) (totalWords);
            probability.add(probabilityOfWord);
        }
        return probability;
    }

    /**
     * This method gives the probability of a word being picked up, if randomly chosen.
     *
     * @param term :This parameter has been used to give word as an input.
     * @return :This is used to return probability of the occurrence of the word.
     **/
    public double getScore(String term) {
        term = term.toLowerCase();
        totalWords = Strings.countNumberOfWordsInSentence(sentence);
        wordFrequency = Strings.countWordFrequency(sentence);
        Integer value = wordFrequency.get(term);
        return (double) (value) / (double) (totalWords);
    }
}
