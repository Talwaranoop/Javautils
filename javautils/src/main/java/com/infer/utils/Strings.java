package com.infer.utils;
import java.io.IOError;
import java.util.IllegalFormatException;

/**
 * The Strings program implements an application that
 * simply converts a string to uppercase or lowercase
 * by using different methods.
 *
 * @author Anoop
 * @since 5/22/2015.
 */
public class Strings {

    /**
     * This method converts a string to Lower Case.
     *
     * @param s     This is the first parameter and is used to input a string.
     * @param start This parameter has been used to declare the starting point
     *              from which the string will be LowerCased.
     * @param len   This parameter has been used to declare the length up to
     *              which the string will be LowerCased.
     * @return This returns the converted LowerCased string.
     */
    public static String toLowerCase(String s, int start, int len) throws IllegalArgumentException
    {
        char[] charArray = s.toCharArray();//Stores sting in array
        try {
            for (int i = start; i < start + len; i++) {
                if (Character.isUpperCase(charArray[i])) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                    if (i <= 0)
                        throw new NumberFormatException
                                ("The argument " + i + " is a negative number!");
                    if (len <= 0)
                        throw new NumberFormatException("The argument " + len + "cannot be zero or negative");
                    if (s.isEmpty())
                        throw new IllegalArgumentException("String cannot be empty");
                }
            }
        }catch(IndexOutOfBoundsException  e) {
            System.err.println("Caught IndexOutOfBoundsException: "
                    +  e.getMessage());
        }
        catch (IOError e) {
            System.err.println("Caught IOError: " +  e.getMessage());
        }
        catch (IllegalFormatException e){
            System.err.println("Please provide correct input: " +  e.getMessage());
        }
        catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " +  e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException:" +  e.getMessage());
        }
        finally{
        }
        return new String(charArray);
    }
    /**
     * This method converts a string to upper case.
     *
     * @param s     This is the first parameter and is used to input a string.
     * @param start This parameter has been used to declare the starting point
     *              from which the string will be UpperCased.
     * @param len   This parameter has been used to declare the length up to
     *              which the string will be UpperCased.
     * @return This returns the converted UpperCased string.
     */
    public static String toUpperCase(String s, int start, int len) throws IllegalArgumentException {
        char[] charArray = s.toCharArray();
        try {
            for (int i = start; i < start + len; i++) {
                if (Character.isLowerCase(charArray[i])) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    if (i <= 0)
                        throw new NumberFormatException
                    ("The argument " + i + " is a negative number!");
                    if (len <= 0)
                        throw new NumberFormatException("The argument " +len + "cannot be zero or negative");
                    if (s.isEmpty())
                        throw new IllegalArgumentException("String cannot be empty");
                }
            }

        }catch(IndexOutOfBoundsException  e) {
            System.err.println("Caught IndexOutOfBoundsException: "
                    +  e.getMessage());
        }
        catch (IOError e) {
            System.err.println("Caught IOError: " +  e.getMessage());
        }
        catch (IllegalFormatException e){
            System.err.println("Please provide correct input: " +  e.getMessage());
        }
        catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " +  e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.err.println("Caught IllegalArgumentException:" +  e.getMessage());

        }
        finally{
        }
        return new String(charArray);
    }

    /**
     * This method converts a string to lower case using byte.
     *
     * @param byteStream This is the first parameter and is used to input a string through byte.
     * @param start      This parameter has been used to declare the starting point
     *                   from which the string will be LowerCased.
     * @param len        This parameter has been used to declare the length up to
     *                   which the string will be LowerCased.
     */
    public static void toLowerCase(byte[] byteStream, int start, int len) throws IllegalArgumentException {
        try {
            for (int i = start; i < start + len; i++) {
                if (byteStream[i] >= 65 && byteStream[i] <= 90) {
                    byteStream[i] = (byte) (byteStream[i] + 32);
                    /**
                     *65 & 90 are ascii codes of byte representing uppercase
                     *  alphabets A & Z respectively.
                     *Where as the '32' also known as Delta is the difference between
                     * an uppercase and a lower case alphabet.
                     */
                    if (i <= 0)
                        throw new NumberFormatException
                                ("The argument " + i + " is a negative number!");
                    if (len <= 0)
                        throw new NumberFormatException("The argument " + len + "cannot be zero or negative");
                }
            }
            System.out.println(new String(byteStream));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (IOError e) {
            System.err.println("Caught IOError: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.err.println("Please provide correct input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        }
        finally{
        }
    }

    /**
     * This method converts a string to upper case using byte.
     *
     * @param byteStream This is the first parameter and is used to input a string through byte.
     * @param start      This parameter has been used to declare the starting point
     *                   from which the string will be UpperCased.
     * @param len        This parameter has been used to declare the length up to
     *                   which the string will be UpperCased.
     */
    public static void toUpperCase(byte[] byteStream, int start, int len) throws IllegalArgumentException {
        try {
            for (int i = start; i < start + len; i++) {
                if (byteStream[i] >= 97 && byteStream[i] <= 122) {
                    byteStream[i] = (byte) (byteStream[i] - 32);
                    /**97 & 122 are ascii codes of byte representing lowercase
                     * alphabets a & z respectively.
                     * Where as the '32' also known as Delta is the difference between
                     * an uppercase and a lower case letter.
                     */
                    if (i <= 0)
                        throw new NumberFormatException
                                ("The argument " + i + " is a negative number!");
                    if (len <= 0)
                        throw new NumberFormatException("The argument " + len + "cannot be zero or negative");
                }
            }
            /**IndexOutOfBoundException is thrown when the entered value exceeds the last index of the array
             */
            System.out.println(new String(byteStream));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (IOError e) {
            System.err.println("Caught IOError: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.err.println("Please provide correct input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        }
        finally{
        }
    }
}
