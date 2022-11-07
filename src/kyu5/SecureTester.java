package kyu5;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/526dbd6c8c0eb53254000110">...</a>
 * Details:
 * In this example you have to validate if a user input string is alphanumeric.
 * The given string is not nil/null/NULL/None, so you don't have to check that.
 */

public class SecureTester {
    public static boolean alphanumeric(String s) {
        return !s.equals("") && s.matches("^[a-zA-Z0-9]*$");
    }
}
