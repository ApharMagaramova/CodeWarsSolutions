package kyu6;

/**
 * 6 kyu
 * <a href="https://www.codewars.com/kata/525f50e3b73515a6db000b83">...</a>
 * Details:
 * Write a function that accepts an array of 10 integers (between 0 and 9),
 * that returns a string of those numbers in the form of a phone number.
 */

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder s = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i <= 2) {
                s.append(numbers[i]);
                if (i == 2) {
                    s.append(") ");
                }
            } else if (i <= 5) {
                s.append(numbers[i]);
                if (i == 5) {
                    s.append("-");
                }
            } else if (i <= 9) {
                s.append(numbers[i]);
            }
        }
        return s.toString();
    }
}
