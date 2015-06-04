package com.infer.utils;
import org.junit.Test ;

import static com.infer.utils.Strings.toLowerCase;
import static com.infer.utils.Strings.toUpperCase;
import static org.junit.Assert.* ;
/**
 * Created by Anoop on 6/1/2015.
 */
public class StringsTest {

    @Test
    public void test_LowerCase(){
        System.out.println("Test if String is Lower cased.. ");
        Strings s = new Strings();
        assertTrue(toLowerCase("THIS IS ANOOP", 4, 4).equals("THIS is ANOOP"));
    }

    @Test
    public void test_UpperCase(){
        System.out.println("Test if String is Upper cased..");
        Strings s = new Strings();
        assertTrue(toUpperCase("this is anoop", 4, 4).equals("this IS anoop"));
    }

    @Test
    public void test_voidLowercase(){
        System.out.println("Test if String is Lower cased..");
        Strings s = new Strings();
        assertTrue(toLowerCase("THIS IS ANOOP", 4, 4).equals("THIS is ANOOP"));
    }

    @Test
    public void test_voidUpperCase(){
        System.out.println("Test if String is Upper cased..");
        Strings s = new Strings();
        assertTrue(toUpperCase("this is anoop", 4, 4).equals("this IS anoop"));
    }

    @Test
    public void testTest_LowerCase() throws Exception {

    }

    @Test
    public void testTest_UpperCase() throws Exception {

    }

    @Test
    public void testTest_voidLowercase() throws Exception {

    }

    @Test
    public void testTest_voidUpperCase() throws Exception {

    }
}
