package com.infer.utils;

import org.junit.Test;

/**
 * Created by Anoop on 6/19/2015.
 */
public class DictionaryLogicTest {
    @Test
    public void willCheckTheSentencesEntered() {
            EntityDictionary git = new EntityDictionary();
            git.add("anoop");
            git.add("amit");
            git.add("vishal");

        DictionaryLogic dl = new DictionaryLogic(git);
            dl.add("Hello anoop,neha and amit ,hello vishal \n");
            dl.add("anoop ,vishal. amit neha ity");

        }

    }