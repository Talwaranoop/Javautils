package com.infer.utils;

import java.util.*;

/**
 * Created by Anoop on 6/19/2015.
 */
public class DictionaryLogic {
    Set diction = new HashSet<String>();
    Map<String, Integer> mp= new HashMap<String, Integer>();

    public DictionaryLogic() {

    }

    public DictionaryLogic(EntityDictionary dict) {
        diction = (Set) dict.getWords();
    }
    /*public void printWords()
    {
        Iterator it = diction.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }*/


    public void add(String str) {
        Iterator it = diction.iterator();
        while (it.hasNext()) {
            mp.put((String) it.next(), 0);
        }
        while (!str.equals("\n")) {
            String[] words = str.split("\\s+");

            for (String word : words) {
                word = word.replace(".", "");
                word = word.replace(",", "");

                if(mp.containsKey(word)) {
                    Integer val= mp.get(word);
                    mp.put(word,val + 1);
                }
                else
                    mp.put(word, 1);
            }

            }
        for(String key: mp.keySet())
        {
            System.out.println(key + ": " + mp.get(key));

        }
    }

    public static void main(String[] args){

            EntityDictionary git = new EntityDictionary();
            git.add("anoop");
            git.add("amit");
            git.add("vishal");

            DictionaryLogic dl = new DictionaryLogic(git);
            //dl.printWords();
            dl.add("Hello anoop,neha and amit ,hello vishal \n");
            //dl.add("anoop ,vishal. amit neha ity");

        }
    }

