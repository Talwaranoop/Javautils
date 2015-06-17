package com.infer.utils;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Anoop on 6/16/2015.
 */
public class EntityDictionary implements Dictionary {
    HashSet<String> hs = new HashSet<String>();

        public void add(String str) {
            //add elements to HashSet
            hs.add(str);

        }

        public boolean contains(String str) {
           if(hs.contains(str))
            return true;
            else
               return false;
        }

        public Collection<String> getWords() {
            hs.size();
            return hs;
        }
    }


