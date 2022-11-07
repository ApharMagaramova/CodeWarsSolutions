package kyu6;

import java.util.Arrays;

/**
 * 6 kyu
 * <a href="https://www.codewars.com/kata/5264d2b162488dc400000001">...</a>
 * Details:
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 */

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() >= 5) {
                String[] letters = (words[i].split(""));
                StringBuilder newWord = new StringBuilder();
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    newWord.append(letters[j]);
                }
                words[i] = newWord.toString();
            }
        }
        return Arrays.toString(words).replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }
}
