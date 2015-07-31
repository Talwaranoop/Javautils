package com.infer.utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        dictionary.add("Samsung electronics ltd");
        dictionary.add("Tesla");
        dictionary.add("Tesla motors");
        dictionary.add("Exxon");
        dictionary.add("Vioin");
        dictionary.add("Vioin Memory");
        dictionary.add("Google");
        dictionary.add("Google Inc");
        dictionary.add("Twitter");
        dictionary.add("Microsoft");
        dictionary.add("BMW");
        wordFrequency = new WordFrequency(dictionary);
    }

    @Test
    /**This test case iterates over the sentences given as
     * input and counts the frequency of dictionary words.
     */
    public void shouldCountDictionaryWordsInSentences() {
        Set<String> wordFrequencies = new HashSet<>();
        wordFrequencies.add("Apple iphone has out numbered Samsung galaxy");
        wordFrequencies.add("Tesla motors ltd and Google are showcasing their self driving cars");
        wordFrequencies.add("BMW buys engine from Tesla motors");
        wordFrequencies.add("Can Microsoft take a lead on Google Android");
        wordFrequencies.add("Google may acquire Twitter");

        // set expectations
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 1);
        expected.put("samsung", 1);
        expected.put("twitter", 1);
        expected.put("tesla motors", 2);
        expected.put("twitter,google", 1);
        expected.put("tesla motors,google", 1);
        expected.put("google,microsoft", 1);
        expected.put("google", 3);
        expected.put("apple,samsung", 1);
        expected.put("microsoft", 1);
        expected.put("bmw", 1);
        expected.put("tesla motors,bmw", 1);
        Map<String, Integer> actual = wordFrequency.getGlobalWordFrequency(wordFrequencies);
        System.out.println(actual);

        // Test Assertion 1: actual and expected must be of same size
        Assert.assertEquals(expected.size(), actual.size());

        for (Map.Entry<String, Integer> expectedEntry : expected.entrySet()) {
            // Test Assertion 2: key from expected map must exist in the actual result and it's count must be as per the expectation
            Assert.assertEquals("key [" + expectedEntry.getKey() + "] with count [" + expectedEntry.getValue() + "] must exist in results"
                    , expectedEntry.getValue(), actual.get(expectedEntry.getKey()));
        }
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