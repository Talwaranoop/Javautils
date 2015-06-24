    package com.infer.utils;
    import org.junit.Assert;
    import org.junit.Rule;
    import org.junit.Test;
    import org.junit.rules.ExpectedException;
    import static org.hamcrest.core.IsEqual.equalTo;

    /**
     * The StringsTest program checks the various conditions
     * through different test cases to make sure that for different
     * inputs, the correct expected outputs or actions happen.
     *
     * Also,it makes sure that for bad inputs, correct handling
     * occurs and the expected outputs or actions still happen.
     *
     * @author Anoop
     * @since  6/1/2015.
     */
    public class StringsTest {

      @Test
      /**This test case checks if the string gets converted to Lowercase
      from the given start to end indices.
       */
      public void shouldConvertStringToLowerCaseFromStartToEndIndices() {
        String recorded;
        String input = "PROGRAMMING IS FUN";//string to be LowerCased.
        String expected = "programming is fun";//expected LowerCased string.
        int start = input.indexOf("P");//declares the alphabet from which string will be LowerCased.
        int end = input.length() - start;//declares the length up to which string will be LowerCased.
        recorded = Strings.toLowerCase(input, start, end);//Stores the value returned from the function.
        Assert.assertEquals(recorded, expected);
      }

      @Test
      /**This test case checks if the string gets converted to Uppercase
      from the given start to end indices.
       */
      public void shouldConvertStringToUpperCaseFromStartToEndIndices() {
        String change;
        String s = "my name is anoop";//string to be UpperCased.
        String expected= "my NAME IS ANOOP";//expected UpperCased string.
        int start = s.indexOf("n");//declares the alphabet from which string will be UpperCased.
        int end = s.length() - start;//declares the length up to which string will be UpperCased.
        change = Strings.toUpperCase(s, start, end);//Stores the value returned from the function .
        Assert.assertEquals(change, expected);
      }

      @Test
      /**This test case checks if the string gets converted to Lowercase
      from the given start to end indices using byte.
       */
      public void shouldConvertBytesToLowerCaseFromStartToEndIndices() {
        String testCase = "THIS IS A TEST";//string to be LowerCased.
        String expected = "This is a test";//expected LowerCased string.
        byte[] bytes = testCase.getBytes();//coverts the string to byte[] and stores it in variable bytes.
        int start = testCase.indexOf("H");//declares the alphabet from which string will be LowerCased.
        int end = testCase.length() - start;//declares the length up to which string will be LowerCased.
        Strings.toByteLowerCase(bytes, start, end);// Upper case bytes should be converted to Lowercase.
        Assert.assertEquals(new String(bytes), expected);
      }

      @Test
      /**This test case checks if the string gets converted to Uppercase
      from the given start to end indices using byte.
       */
      public void shouldConvertBytesToUpperCaseFromStartToEndIndices() {
        String entered = "videogames are fun";//string to be UpperCased.
        String expected = "viDEOGAMES ARE FUN";//expected UpperCased string.
        byte[] bytes = entered.getBytes();//coverts the string to byte[] and stores it in variable bytes.
        int start = entered.indexOf("d");//declares the alphabet from which string will be UpperCased.
        int end = entered.length() - start;//declares the length up to which string will be UpperCased
        Strings.toByteUpperCase(bytes, start, end);// Lower case bytes should be converted to Uppercase.
        Assert.assertEquals(new String(bytes), expected);
      }
      @Rule
      public ExpectedException thrown = ExpectedException.none();

      @Test
      public void throwsExceptionWhenNegativeNumbersAreGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        int len = -2;
        thrown.expectMessage(equalTo("The argument " + len + "cannot be negative"));
        // act
        String s = "iammad";
        int start = 1;
        Strings.toLowerCase(s, start, len);
      }
      @Test
      public void throwsIllegalArgumentExceptionWhenSpecialCharactersAreGiven(){
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = "@#$";
        thrown.expectMessage(equalTo("String cannot contain special characters"));
        // act
        int start = 1;
        int len = 2;
        Strings.toLowerCase(input, start, len);


      }
      @Test
      public void throwsIllegalArgumentExceptionWhenNullStringIsGiven() {
        // arrange
        thrown.expect(IllegalArgumentException.class);
        String input = null;
        thrown.expectMessage(equalTo("The string cannot be null!"));
        // act
        int start = 1;
        int len = 2;
        Strings.toLowerCase(null, start, len);
      }
      @Test
      public void throwsIllegalArgumentExceptionWhenNullByteArrayIsGiven() {
        byte[] bytes = null;
        // arrange
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(equalTo("The byte cannot be null!"));
        // act
        int start = 1;
        int len = 2;
        Strings.toByteLowerCase(null, start, len);
      }
    }


