package com.infer.utils;

import org.junit.Test;

import static com.infer.utils.Strings.toLowerCase;
import static com.infer.utils.Strings.toUpperCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Anoop on 6/1/2015.
 */
public class StringsTest {

    @Test
    public void testLowerCase() {
        Strings s = new Strings();
        assertTrue(toLowerCase("THIS IS ANOOP", 4, 4).equals("THIS is ANOOP"));
    }

    @Test
    public void testUpperCase() {
        Strings s = new Strings();
        assertTrue(toUpperCase("this is anoop", 4, 4).equals("this IS anoop"));
    }

    @Test
    public void testvoidLowercase() {
        Strings s = new Strings();
        assertTrue(toLowerCase("THIS IS ANOOP", 4, 4).equals("THIS is ANOOP"));
        assertEquals("THIS is ANOOP",toLowerCase("THIS IS ANOOP", 4, 4));
    }

    @Test
    public void testvoidUpperCase() {
        Strings s = new Strings();
        assertTrue(toUpperCase("this is anoop", 4, 4).equals("this IS anoop"));
    }

    @Test
    public void testTestLowerCase() throws Exception {

    }

    @Test
    public void testTestUpperCase() throws Exception {

    }

    @Test
    public void testTestvoidLowercase() throws Exception {

    }

    @Test
    public void testTestvoidUpperCase() throws Exception {

    }
}
