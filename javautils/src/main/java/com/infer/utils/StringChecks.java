package com.infer.utils;

/**
 * @author Anoop
 * @since 7/30/2015.
 */
public class StringChecks {

    public static void checkEmptyAndNullConditions(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (sentence.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty");
        }
    }

}