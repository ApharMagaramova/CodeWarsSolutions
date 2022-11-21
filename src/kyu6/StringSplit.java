package kyu6;

/**
 * 6 kyu
 * <a href="https://www.codewars.com/kata/515de9ae9dcfc28eb6000001">...</a>
 * Details:
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then
 * it should replace the missing second character of the final pair with an underscore ('_').
 */

public class StringSplit {
    public static String[] solution(String s) {
        String[] str = s.split("");
        String[] result;
        result = s.length() % 2 == 0 ? new String[s.length() / 2] : new String[s.length() / 2 + 1];

        if (s.length() == 0) {
            return result;
        }
        for (int i = 0; i < str.length; i++) {
            if (result[i / 2] == null) {
                result[i / 2] = str[i];
            } else {
                result[i / 2] += str[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != null && result[i].length() == 1) {
                result[i] += "_";
                System.out.println(result[i]);
            }
        }
        return result;
    }
}
