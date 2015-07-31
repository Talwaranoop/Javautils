package com.infer.utils;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * The TermVectorTest program checks the various conditions
 * through different test cases to make sure that for different
 * inputs, the correct expected outputs or actions happen.
 * <p>
 * Also,it makes sure that for bad inputs, correct handling
 * occurs and the expected outputs or actions still happen.
 *
 * @author Anoop
 * @since 7/29/2015.
 */

public class TermVectorTest {
    private TermVector termVector = new TermVector("Apple is awesome Apple is great");

    /**
     * This Test case  Computes probability of occurrence of a certain word as
     * (number of times the word occurs / total number of words).
     **/
    @Test
    public void getProbability() {
        List<Double> actual = termVector.getVector();
        List<Double> expected = new ArrayList<>();
        expected.add(0.3333333333333333);
        expected.add(0.3333333333333333);
        expected.add(0.16666666666666666);
        expected.add(0.16666666666666666);
        // Test Assertion : actual and expected must be of same size.
        Assert.assertEquals(expected.size(), actual.size());
        Assert.assertEquals(expected, actual);

    }

    /**
     * This Test case gives the probability of a word being picked up, if randomly chosen.
     */
    @Test
    public void getTermProbability() {
        double actual = termVector.getScore("Apple");
        double expected = 0.3333333333333333;
        Assert.assertEquals(expected, actual, 0.3333333333333333);
        //System.out.println(actual);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * This test case confirms that if the null string is entered
     * as input the correct handling occurs.
     */
    @Test
    public void throwsIllegalArgumentExceptionWhenNullStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be null"));
        // act
        termVector = new TermVector(null);
    }

    /**
     * This test case confirms that if the empty string in entered
     * as input the correct handling occurs.
     */
    @Test
    public void throwsIllegalArgumentExceptionWhenEmptyStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        termVector = new TermVector("");
    }
}
