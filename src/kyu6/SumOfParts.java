package kyu6;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/5ce399e0047a45001c853c2b">...</a>
 * Details:
 * The function parts_sums (or its variants in other languages) will take as parameter a list ls and
 * return a list of the sums of its parts as defined above.
 */

public class SumOfParts {
    public static int[] sumParts(int[] ls) {
        int[] sum = new int[ls.length + 1]; //7leng
        sum[sum.length - 1] = 0; //index 6
        for (int i = ls.length - 1; i >= 0; i--) { // index 5
            sum[i] = sum[i + 1] + ls[i];
        }

        return sum;
    }
}
