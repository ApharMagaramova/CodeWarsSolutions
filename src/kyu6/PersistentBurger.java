package kyu6;

/**
 * 6 kyu
 * <a href="https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec">...</a>
 * Details:
 * Write a function, persistence, that takes in a positive parameter num and
 * returns its multiplicative persistence, which is the number of times
 * you must multiply the digits in num until you reach a single digit.
 */

public class PersistentBurger {
    public static int persistence(long n) {
        int count = 0;
        long remainder;
        while (n >= 10) {
            long multiply = 1;
            while (n >= 1) {
                remainder = n % 10;
                multiply = multiply * remainder;
                n /= 10;
            }
            n = multiply;
            count++;
        }
        return count;
    }
}
