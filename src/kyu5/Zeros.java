package kyu5;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/52f787eb172a8b4ae1000a34/java">Zeros</a>
 * * Details:
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 */

public class Zeros {
    public static int zeros(int n) { // n%100==0
        int zero = 0;
        if (n >= 5) {
            for (int i = 1; i < Math.sqrt(n); i++) {
                zero += (n / Math.pow(5, i));
            }
        }
        return zero;
    }
}
