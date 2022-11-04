package kyu5;

import java.util.HashMap;
import java.util.Map;

/**
 * 5 kyu
 * <a href="https://www.codewars.com/kata/55c04b4cc56a697bb0000048">...</a>
 * Details:
 * Complete the function scramble(str1, str2) that
 * returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 */

public class Scramble {
    public static boolean scramble(String str1, String str2) {
        Map<Character, Integer> word1 = countLetters(str1);
        Map<Character, Integer> word2 = countLetters(str2);

        for (Character c : word2.keySet()) {
            Integer n = word1.get(c);
            if (n == null || n < word2.get(c)) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> countLetters(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
//            same with merge
//            if (n == null) {
//                map.put(c, 1);
//            } else {
//                map.put(c, n + 1);
//            }
        }
        return map;
    }
}
