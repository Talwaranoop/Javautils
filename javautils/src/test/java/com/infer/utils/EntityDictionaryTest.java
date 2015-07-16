package com.infer.utils;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * The EntityDictionaryTest program checks the various conditions
 * through different test cases to make sure that for different
 * inputs, the correct expected outputs or actions happen.
 *
 * Also,it makes sure that for bad inputs, correct handling
 * occurs and the expected outputs or actions still happen.
 *
 * @author Anoop
 * @since 6/17/2015.
 */

public class EntityDictionaryTest {
    private EntityDictionary obj;

    @Before
    public void executedBeforeEach() {
        obj = new EntityDictionary();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    /**This test case confirms that if the null string in entered
     * as input the correct handling occurs.
     */
    public void throwsIllegalArgumentExceptionWhenNullStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The string cannot be null!"));
        // act
        obj.add(null);
    }

    @Test
    /**This test case confirms that if the empty string in entered
     * as input the correct handling occurs.
     */
    public void throwsIllegalArgumentExceptionWhenEmptyStringIsGiven() {

        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "";
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        obj.add(input);
    }

}