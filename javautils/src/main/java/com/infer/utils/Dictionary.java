package com.infer.utils;

import java.util.Collection;

/**
 * Created by Anoop on 6/15/2015.
 */
public interface Dictionary {
    void add(String str);
    boolean contains(String str);
    Collection<String> getWords();
}

class EntityDictionary implements Dictionary {


    public void add(String str) {

    }

    public boolean contains(String str) {
        return false;
    }

    public Collection<String> getWords() {
        return null;
    }
}
