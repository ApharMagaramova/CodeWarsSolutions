package kyu5;

import java.util.Arrays;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/54d4c8b08776e4ad92000835">...</a>
 * Details:
 * In mathematics, a perfect power is a positive integer that can be expressed
 * as an integer power of another positive integer.
 * More formally, n is a perfect power if there exist natural numbers m > 1, and k > 1 such that m^k = n.
 * Your task is to check whether a given integer is a perfect power. If it is a perfect power,
 * return a pair m and k with m^k = n as a proof.
 * Otherwise, return Nothing, Nil, null, NULL, None or your language's equivalent.
 */

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int uprBound = (int) Math.sqrt(n);
        int tempN = n;
        int j = 0;
        for (int i = 2; i <= uprBound; i++) {
            while (tempN % i == 0 && tempN > 1) {
                tempN = tempN / i;
                j++;
            }
            if (tempN == 1) {
                return new int[]{i, j};
            }
            tempN = n;
            j = 0;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower(4)));
    }
}
