    package com.infer.utils;

    import java.util.*;

    /**
     * The WordFrequency program implements an application that
     *  iterates over the sentences given as input  and count the
     *  frequency of EntityDictionary words.
     *
     * @author Anoop
     * @since  6/19/2015.
     */
    public class WordFrequency {
        public List<String> Combinations = new ArrayList<>();
        public Collection<String> diction = new HashSet<>();

        public WordFrequency() {

        }

        public WordFrequency(EntityDictionary dict) throws IllegalArgumentException{//object of EntityDictionary class passed as constructor argument.
            if(dict == null)
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
            String[]words = sentence.split("\\s+"); // Splits the line on White Space.
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
            Combinations = Strings.getAllCombination(wordToCount.keySet());
            for(String s: Combinations)
            {
                wordToCount.put(s,1);
            }
            return wordToCount;
        }

       public Map<String,Integer> getCountOfCombinations(String sentence){

            return null;
        }
   }