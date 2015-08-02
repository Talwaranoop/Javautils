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
    private TermVector termVector = new TermVector("Apple is awesome Apple is great",2);

    /**
     * This Test case  Computes probability of occurrence of a certain word as
     * (number of times the word occurs / total number of words).
     **/
    @Test
    public void getProbability() {
        List<Double> actual = termVector.getVector();
        List<Double> expected = new ArrayList<>();
        expected.add(0.2);
        expected.add(0.06666666666666667);
        expected.add(0.06666666666666667);
        expected.add(0.13333333333333333);
        expected.add(0.06666666666666667);
        expected.add(0.06666666666666667);
        expected.add(0.06666666666666667);
        expected.add(0.13333333333333333);
        expected.add(0.06666666666666667);
        expected.add(0.06666666666666667);
        expected.add(0.06666666666666667);

        //Test Assertion : actual and expected must be of same size.
        Assert.assertEquals(expected.size(), actual.size());
        Assert.assertEquals(expected, actual);
        System.out.println(actual);
    }

    /**
     * This Test case gives the probability of a word being picked up, if randomly chosen.
     */
    @Test
    public void getTermProbability() {
        double actual = termVector.getScore("Apple,is");
       // System.out.println(actual);
        double expected= 0.2;
        Assert.assertEquals(expected, actual,0.0);

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * This test case confirms that if the null sentence is entered
     * as input the correct handling occurs.
     */
    @Test
    public void throwsIllegalArgumentExceptionWhenNullSentenceIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be null"));
        // act
        termVector = new TermVector(null,0);
    }

    /**
     * This test case confirms that if the empty sentence in entered
     * as input the correct handling occurs.
     */
    @Test
    public void throwsIllegalArgumentExceptionWhenEmptySentenceIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        termVector = new TermVector("",0);
    }
    /**
     * This test case confirms that if the empty Term is entered
     * as input the correct handling occurs.
     */
    @Test
    public void throwsIllegalArgumentExceptionWhenEmptyTermIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        termVector.getScore("");
    }
    /**
     * This test case confirms that if the null term is entered
     * as input the correct handling occurs.
     */
    @Test
    public void throwsIllegalArgumentExceptionWhenNullTermIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("String cannot be null"));
        // act
        termVector.getScore(null);
    }
}
