package com.infer.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Anoop
 * @since 7/29/2015.
 */

public class TermVectorTest {
    private TermVector termVector = new TermVector("Apple is awesome Apple is great");

    @Test
    public void getProbability() {
        termVector.countWordFrequency();
        List<Double> actual = termVector.getVector();
        System.out.println(actual);
    }

    @Test
    public void getTermProbability() {
        termVector.countWordFrequency();
        double score = termVector.getScore("apple");
        System.out.println(score);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsIllegalArgumentExceptionWhenNullStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be null"));
        // act
        termVector = new TermVector(null);
    }

    @Test
    public void throwsIllegalArgumentExceptionWhenEmptyStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "";
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        termVector = new TermVector("");
    }
}
