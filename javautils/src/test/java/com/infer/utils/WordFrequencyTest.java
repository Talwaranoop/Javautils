    package com.infer.utils;

    import org.junit.Rule;
    import org.junit.Test;
    import org.junit.rules.ExpectedException;

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
        WordFrequency obj = new WordFrequency();//

        @Test
        /**This test case iterates over the sentences given as
         * input and counts the frequency of dictionary words.
         */
        public void countWords(){

            EntityDictionary git = new EntityDictionary();
            git.add("A");
            git.add("B");
            git.add("C");
            git.add("D");
            WordFrequency dl = new WordFrequency(git);
            dl.add("A can't be B, A may also be C, How about C, D and A");
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
            obj.add(null);
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
            obj.add(input);
        }
    }