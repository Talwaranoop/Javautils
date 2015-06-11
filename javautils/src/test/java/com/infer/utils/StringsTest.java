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
  public void shouldConvertBytesToLowerCaseFromStartToEndIndices() {
    String testCase = "THIS IS A TEST";
    String expected = "This is a test";
    byte[] bytes = testCase.getBytes();
    int start = testCase.indexOf("H");
    int end = testCase.length() - start;
    // upper case bytes should be converted to lowercase
    Strings.toByteLowerCase(bytes, start, end);
    Assert.assertEquals(new String(bytes), expected);
  }

  @Test
  public void testVoidUpperCase() {
    //Assert.assertEquals(toByteUpperCase("".getBytes(), 4, 4), ("this IS anoop"));
  }

}