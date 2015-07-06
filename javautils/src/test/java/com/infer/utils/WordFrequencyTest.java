    package com.infer.utils;

    import org.junit.Rule;
    import org.junit.Test;
    import org.junit.rules.ExpectedException;

    import java.util.Collections;
    import java.util.HashMap;
    import java.util.Map;

    import static org.hamcrest.core.IsEqual.equalTo;

    /**
     * The WordFrequencyTest program checks the various conditions
     * through different test cases to make sure that for different
     * inputs, the correct expected outputs or actions happen.
     *
     * Also,it makes sure that for bad inputs, correct handling
     * occurs and the expected outputs or actions still happen.
     *
     * @author Anoop
     * @since  6/19/2015.
     */
    public class WordFrequencyTest {
        WordFrequency obj = new WordFrequency();

        @Test
        /**This test case iterates over the sentences given as
         * input and counts the frequency of dictionary words.
         */
        public void shouldCountDictionaryWordsInSentences(){
            Map<String, Integer> mp= new HashMap<String, Integer>();
            EntityDictionary dictionary = new EntityDictionary();
            dictionary.add("Anoop");
            dictionary.add("Baba");
            dictionary.add("Cat");
            WordFrequency wordFrequency = new WordFrequency(dictionary);
            mp = wordFrequency.getWordFrequency("Anoop can't be Baba and Anoop can never be D and D can never be Cat ");
            for(String key: mp.keySet())
            {
                System.out.println(key + ": " + mp.get(key));

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
            String input = null;
            thrown.expectMessage(equalTo("The string cannot be null!"));
            // act
            obj.getWordFrequency(null);
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
            obj.getWordFrequency(input);
        }
    }