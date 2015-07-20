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
        dictionary.add("Samsung galaxy ace pvt ltd");
        dictionary.add("Samsun galaxy ace");
        dictionary.add("Samsung");
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
        wordFrequencies.add("Apple iphone has out numbered Samsung galaxy ace pvt ltd");
        // wordFrequencies.add("Tesla motors ltd and Google are showcasing their self driving cars Samsung");
        // wordFrequencies.add("BMW buys engine from Tesla motors");
        //wordFrequencies.add("Can Microsoft take a lead on Google Android");
        //wordFrequencies.add("Google may acquire Twitter");
        Map<Object, Object> combinations = new HashMap<>();
        combinations.put("apple", 1);
        combinations.put("samsung galaxy ace pvt ltd", 1);
        combinations.put("apple,samsung galaxy ace pvt ltd", 1);
        Map result;
        result = wordFrequency.getGlobalWordFrequency(wordFrequencies);
        Assert.assertEquals(result, combinations);
        //System.out.println(wordFrequency.getGlobalWordFrequency(wordFrequencies));
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