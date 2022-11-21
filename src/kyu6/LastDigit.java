package kyu6;

import java.math.BigInteger;

/**
 * 6 kyu
 * <a href="https://www.codewars.com/kata/5511b2f550906349a70004e1">...</a>
 * Details:
 * Define a function that takes in two non-negative integers a and b and returns the last decimal digit of a^b
 * Note that a and b may be very large!
 */

public class LastDigit {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        int num = n1.intValue() % 10;
        int pow = n2.intValue() % 100;

        return (int) Math.pow(num, pow) % 10;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(new BigInteger("10"), new BigInteger("10000000000")));
    }
}
