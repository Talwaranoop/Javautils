package com.infer.utils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * The WordFrequencyTest program checks the various conditions
 * through different test cases to make sure that for different
 * inputs, the correct expected outputs or actions happen.
 * <p>
 * Also,it makes sure that for bad inputs, correct handling
 * occurs and the expected outputs or actions still happen.
 *
 * @author Anoop
 * @since 6/19/2015.
 */
public class WordFrequencyTest {

    private WordFrequency wordFrequency;

    @Before
    public void executedBeforeEach() {
        EntityDictionary dictionary = new EntityDictionary();
        dictionary.add("Apple");
        dictionary.add("Samsung");
        dictionary.add("Samsung galaxy");
        dictionary.add("Tesla motors");
        dictionary.add("Exxon");
        dictionary.add("Vioin");
        dictionary.add("Google");
        dictionary.add("Twitter");
        dictionary.add("Microsoft");

        wordFrequency = new WordFrequency(dictionary);
    }

    @Test
    /**This test case iterates over the sentences given as
     * input and counts the frequency of dictionary words.
     */
    public void shouldCountDictionaryWordsInSentences() {
        Set<String> wordFrequencies = new HashSet<>();
        wordFrequencies.add("Apple iphone has out numbered Samsung galaxy");
        wordFrequencies.add("Tesla motors and Google are showcasing their self driving cars Samsung");
        wordFrequencies.add("BMW buys engine from Tesla motors");
        wordFrequencies.add("Can Microsoft take a lead on Google Android");
        wordFrequencies.add("Google may acquire Twitter");

        System.out.println(wordFrequency.getGlobalWordFrequency(wordFrequencies));



   /* Map<String, Integer> wordFrequencies = new HashMap<>();

    Map<String, Integer> wordFrequency1 = wordFrequency.getWordFrequency("Apple iphone has out numbered Samsung galaxy");
    Map<String, Integer> wordFrequency2 = wordFrequency.getWordFrequency("Tesla and Google are showcasing their self driving cars");
    Map<String, Integer> wordFrequency3 = wordFrequency.getWordFrequency("Can Microsoft take a lead on Google Android");
    Map<String, Integer> wordFrequency4 = wordFrequency.getWordFrequency("Google may acquire Twitter");

    for (String key : wordFrequency1.keySet()) {
      System.out.println(key + ": " + wordFrequencies.get(key));}*/
    }


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    /**This test case confirms that if the null string in entered
     * as input the correct handling occurs.
     */
    public void throwsIllegalArgumentExceptionWhenNullStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The string cannot be null!"));
        // act
        wordFrequency.getWordFrequency(null);
    }

    @Test
    /**This test case confirms that if the empty string in entered
     * as input the correct handling occurs.
     */
    public void throwsIllegalArgumentExceptionWhenEmptyStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "";
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        wordFrequency.getWordFrequency(input);
    }

    @Test
    /**This test case confirms that if the null Dictionary is entered
     * as input the correct handling occurs.
     */
    public void throwsIllegalArgumentExceptionWhenNullDictionaryIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The Dictionary cannot be null!"));
        // act
        WordFrequency wordFrequency = new WordFrequency(null);

    }
}