package kyu5;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/52774a314c2333f0a7000688">...</a>
 * Details:
 * Write a function that takes a string of parentheses, and
 * determines if the order of the parentheses is valid.
 * The function should return true if the string is valid, and false if it's invalid.
 */

public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        String[] arr = parens.split("");
        int counter = arr.length;
        for (String s : arr) {
            if (s.equals("(")) {
                counter--;
            }
            if (s.equals(")")) {
                counter++;
                if (counter > arr.length) {
                    return false;
                }
            }
        }
        return counter == arr.length;
    }
}
