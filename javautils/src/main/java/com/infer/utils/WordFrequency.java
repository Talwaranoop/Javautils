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
        Set diction = new HashSet<String>();//HashSet declaration
         Map<String, Integer> mp= new HashMap<String, Integer>();//HashMap declaration

        public WordFrequency() {//Default Constructor

        }

        public WordFrequency(EntityDictionary dict) {//object of EntityDictionary class passed as constructor argument.
            diction = (Set) dict.getWords();//copies all the words present in the EntityDictionary set to the diction set.
        }
        /**
         * This method adds the Sentence to the Dictionary.
         * @param str : This parameter has been used to
         *              add Sentence to the Dictionary.
         */
        public void add(String str)throws IllegalArgumentException {
            if(str == null)
                throw new IllegalArgumentException("The string cannot be null!");
            if (str.isEmpty())
                throw new IllegalArgumentException("String cannot be empty");
            for (Object aDiction : diction) {
                mp.put((String) aDiction, 0);//Puts all the words from diction set to map 'mp' and assigns 0 value to words.
            }
                String[] words = str.split("\\s+"); // Splits the input line.

            for (String word : words) {
                    word = word.replaceAll("[.,?!:;/]", "");// replaces any grammatical characters.

                    if(mp.containsKey(word)) {
                        Integer val= mp.get(word);
                        mp.put(word,val + 1);// increases the count value of the word.
                    }
                }
            // Printing all words stored in the map.
            for(String key: mp.keySet())
            {
                System.out.println(key + ": " + mp.get(key));

            }
        }
    }

