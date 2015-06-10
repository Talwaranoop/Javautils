package com.infer.utils;

import org.junit.Assert;
import org.junit.Test;

import static com.infer.utils.Strings.*;

/**
 * Created by Anoop on 6/1/2015.
 */
public class StringsTest {

    @Test

    public void testLowerCase() throws IllegalArgumentException {

        Assert.assertEquals(toLowerCase(null, 2, 0), (null));
    }

    @Test
    public void testUpperCase() {
        Assert.assertEquals(toUpperCase("anoop", 2, -1), ("anoop"));
    }

    @Test
    public void testVoidLowercase() {
        Assert.assertEquals(toByteLowerCase(, 0, 0),();
    }

    @Test
    public void testVoidUpperCase() {
        Assert.assertEquals(toByteUpperCase("", 4, 4), ("this IS anoop"));
    }

}