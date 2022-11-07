package kyu7;

/**
 * 7 kyu
 * <a href="https://www.codewars.com/kata/54ff3102c1bad923760001f3">...</a>
 * Details:
 * Return the number (count) of vowels in the given string.
 */

public class VowelCount {
    public static int getCount(String str) {
        String[] character = str.split("");
        int count = 0;
        for (String s : character) {
            switch (s) {
                case "a", "e", "i", "o", "u" -> count++;
            }
        }
        return count;
    }
}
