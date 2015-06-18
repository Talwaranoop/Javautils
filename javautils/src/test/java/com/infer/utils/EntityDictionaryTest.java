package com.infer.utils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;

/**
 * The EntityDictionaryTest program checks the various conditions
 * through different test cases to make sure that for different
 * inputs, the correct expected outputs or actions happen.
 *
 * Also,it makes sure that for bad inputs, correct handling
 * occurs and the expected outputs or actions still happen.
 * @author Anoop
 * @since  6/17/2015.
 */

public class EntityDictionaryTest {
    EntityDictionary obj = new EntityDictionary();

    @Test
    public void willCheckTheWordsEntered() {

        String input = "programming";
        String expected = "programming";
        obj.add(input);
        Assert.assertEquals(input, expected);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsIllegalArgumentExceptionWhenNullStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = null;
        thrown.expectMessage(equalTo("The string cannot be null!"));
        // act
        obj.add(null);
    }
    @Test
    public void throwsIllegalArgumentExceptionWhenEmptyStringIsGiven() {

        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "";
        thrown.expectMessage(equalTo("String cannot be empty"));
        // act
        obj.add(input);
    }
    @Test
    public void throwsIllegalArgumentExceptionWhenNumbersAreGiven(){
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "12345";
        thrown.expectMessage(equalTo("String cannot contain numbers"));
        // act
        obj.add(input);

    }
    @Test
    public void throwsIllegalArgumentExceptionWhenSpecialCharactersAreGiven(){
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "@#$";
        thrown.expectMessage(equalTo("String cannot contain special characters"));
        // act
        obj.add(input);

    }
}