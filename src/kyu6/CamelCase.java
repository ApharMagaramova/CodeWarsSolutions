package kyu6;

/**
 * 6 kyu
 * <a href="https://www.codewars.com/kata/5208f99aee097e6552000148">...</a>
 * Details:
 * Complete the solution so that the function will break up camel casing, using a space between words.
 */

public class CamelCase {
    public static String camelCase(String input) {
        String[] inputArr = input.split("");
        StringBuilder newWord = new StringBuilder();

        if (inputArr.length > 0 && !input.isBlank()) {
            for (String s : inputArr) {
                if (s.toUpperCase().equals(s)) {
                    newWord.append(" ");
                }
                newWord.append(s);
            }
        }
        return newWord.toString();
    }
}
